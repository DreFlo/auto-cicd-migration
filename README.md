# CICD Language Transpiler

[![DOI](https://zenodo.org/badge/753056108.svg)](https://zenodo.org/doi/10.5281/zenodo.11922313)

## Project Structure

- [cli](./cli/) - Contains the source code for the command line interface and the logic to integrate the various modeling projects into one cohesive program
- [meta-models](./meta-models/) - Contains the meta-models that serve as the basis for the program
- [dsls](./dsls/) - Contains the Xtext projects for T2M transformations (where applicable)
- [code-generation](./code-generation/) - Contains the Acceleo projects for M2T transformations
- [transformations](./cli/src/main/resources/transformations/) - Contains the ATL files used in M2M transformations
- [validations](./cli/src/main/resources/validations/) - Contains the OCL files used for validating models

## Building and Running

See [CLI README](./cli/README.MD).
