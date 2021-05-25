# Proto Design

## Summary

These message definitions are reused across Promoted's Delivery and Metrics API.  We use Protobufs to define our messages.  Our APIs also supports the JSON version of the Protobufs.

## Design principles:

- Our APIs should "just work".  They need to feel intuitive and be extensible.  It should be easy to get a simple v1 working.  There should be paths to optimize it.
- Prefer giving clients a representation that matches how they think about the API.  Most clients would prefer passing around objects in their own domain structure than matrices/tables.
- Allow easy prototyping by supporting configuration inputs directly in the API.

## Reuse Protos across Delivery and Metrics

We want Delivery and Metrics to have the ~same Protos for `Request`, `Response` and `Insertion`.  Using the same Proto makes our solutions more cohesive, simplifies the whole stack and increases our developer velocity.  Delivery is the core owners the `Request`, `Response` and `Insertion` Protos.  Metrics will take the Protos as records to log and process them.

Metrics will store and output the Delivery Protos to scale better.

## "Easy JSON" to Efficient Protos

We want an easy initial integration for customers.  Start with a JSON-like structure and evolve to Protos.  We want a more efficient format in our data infrastructure.  JSON is very inefficient.  Protobuf is 5-10x more efficient interms of number of bytes, it processes faster and has built-in types.  We want to support overall APIs using both JSON and Protobufs.

## Properties

We support a properties object that allows custom payloads to be attached to records.  One one of the `struct_bytes` (Protobuf) or `struct` (JSON-like) can be set.

```
message Insertion {
  ...

  // Optional.  Contains protobuf-serialized {Platform}Insertion.
  // Supports JSON-like struct or binary proto.
  Properties properties = 20;
}

// Platform-specific message.  This is the message serialized on `payload_bytes`.
message MymarketInsertion {
  MymarketContent content = 1;
  ...
}

message Properties {
  oneof struct_field {
    // Optional.  Contains protobuf serialized bytes.
    bytes struct_bytes = 1;
    // Optional.  Can be converted to/from JSON.
    google.protobuf.Struct struct = 2;
  }
```

For properties, we will have two fields: `struct_bytes` and `struct`.  Our servers can handle either version.

# Dependency

- We do not want `delivery` protos to depend on `event` protos.
  - `common <- delivery <- event`
  - `common <- event`
- We do not want `event` or `delivery` to depend on customer-specific protos.

Here are other planned dependency changes:
- We will eventually remove the `delivery <- event` dependency and make all log records to be logged as `bytes`.
- Split gRPC dependency from the proto messages.
- Split event records into their own build targets.
- Support a mini-LogRequest for mobile so we do not need mobile to depend on `delivery` protos.
