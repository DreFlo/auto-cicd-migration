# ACICDTrip, a CICD Pipeline Transpiler

<a href="https://zenodo.org/doi/10.5281/zenodo.11922313"><img src="https://zenodo.org/badge/753056108.svg" alt="DOI"></a>

## About

Projects pericodically migrate either part or the entirety of their CI/CD pipelines to different platforms chasing better pricing, reliability, and features (more info [here](https://dreflo.github.io/auto-cicd-migration/doc/thesis/msr.pdf)). This process is lenghty and can result in a drop in productivity, mean projects become locked into their current CI/CD platform.

ACICDTrip automatically migrates input pipelines to a platform chosen by the user. This significantly speeds up the migration process, increasing developer productivity and reducing lock-in.

ACICDTrip was developed using model-driven engineering. Logic is implemented through meta-models and model transformations.

This project is part of my master's thesis. Final grade **20/20**. Read dissertation [here](./doc/thesis/thesis.pdf).

## Building

In ```/cli``` run ```gradle installDist```.

## Running

Executable is ```cli.bat```.

|OPTION|DESCRIPTION|OPTIONAL|NUMBER OF ARGUMENTS|
|-|-|-|-|
|-il|Input language.|False|[1,*]|
|-ol|Output language.|False|1|
|-i|Input files.|True|[0,*]|
|-o|Output files.|True|[0,1]|
|-v|Verbose mode.|True|0|
|-s|Strict mode.|True|0|
|-ef|Custom migration rules file.|True|[0,1]|
|-lf|Log file.|True|[0,1]|

If ```-i``` or ```-o``` are not provided, the program will read from ```stdin``` and write to ```stdout``` respectively.

## Features

Currently supports GitHub Actions and CircleCI.

### Automatic Migration

ACICDTrip automatically translates pipelines between platforms, as seen below.

#### Partial or Complete Migration

If ACICDTrip is run in ```strict``` mode, it will only translate a pipeline if it can do so completely. Otherwise, ACICDTrip will migrate any input pipeline, but only partially (according to supported features).

### Automatic Pipeline Merging

One of the main motivators for platform migration is to reduce the total amount of platforms used by a project. If multiple input pipelines, ACICDTrip will attempt to merge them according to a set of predefined rules.

### Platform-Independent Syntax for Pipelines

ACICDTrip supports extension files with transformation rules written in a provided, platform-independent domain-specific language.

## Architecture

- [cli](./cli/) - Contains the source code for the command line interface and the logic to integrate the various modeling projects into one cohesive program
- [meta-models](./meta-models/) - Contains the meta-models that serve as the basis for the program
- [dsls](./dsls/) - Contains the Xtext projects for T2M transformations (where applicable)
- [code-generation](./code-generation/) - Contains the Acceleo projects for M2T transformations
- [transformations](./cli/src/main/resources/transformations/) - Contains the ATL files used in M2M transformations
- [validations](./cli/src/main/resources/validations/) - Contains the OCL files used for validating models

## Evaluation

### Case Studies

### Automated Testing
