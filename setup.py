from setuptools import setup, find_packages

with open('README.md') as f:
    readme = f.read()

setup(
    name='schema',
    version='1.0.1',
    description='Core schema',
    long_description=readme,
    author='Dan Hill',
    author_email='dhill@promoted.ai',
    url='https://github.com/promotedai/schema',
    package_dir={'': 'generated/py'},
    packages=find_packages('generated/py'),
    install_requires=[],
    package_data={
        '': ['*.pyi', 'py.typed', '*/*.pyi', '*/*/*.pyi'],
    },
    include_package_data=True,
)
