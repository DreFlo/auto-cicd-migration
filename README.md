# ACICDTrip, a CICD Pipeline Transpiler

<a href="https://zenodo.org/doi/10.5281/zenodo.11922313"><img src="https://zenodo.org/badge/753056108.svg" alt="DOI"></a>

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


## How ACICDTrip works

![reengineering-diagram](https://github.com/user-attachments/assets/7cde6b05-a0a4-4f63-800d-e486a892b0f1)

Text-to-model transformations (**I**) convert an input pipeline configuration file (**1**) to a platform-specific model (**2**). 

That platform-specific model is transformed into a platform-independent model (**3**) that conforms to the platform-independent meta-model (**4**) through model-to-model transformations (**II**). 

We then transform the platform-independent model to a model for a different pipeline platform (**5**). 

The translated configuration file (**6**) is generated from the new platform-specific model through model-to-text transformations (**III**). 

The user can interact with this process with a domain-specific languge to perform model-to-model transformations on the platform-independent and platform-specific models (**IV**). 

Strict mode is implemented using a model validation on the input platform-specific model (**2**).

## Project Structure

### Meta-Models

Meta-models create the rules for valid instances of pipelines.

There are various meta-models in ACICDTrip. These describe GitHub Actions, CircleCI, and Jenkins pipelines. The most important meta-model is the platform-independent meta-model, as this meta-model lets us create an intermediate representation that  is used when migrating platforms.

There is also a meta-model to describe extension files.

[/meta-models](./meta-models/) contains the meta-models that serve as the basis for the program.

### Text Parsing

Text is parsed to models using either YAML-based or Xtext parsers.

[/dsls](./dsls/) contains the Xtext projects for text-to-model transformations (where applicable).

### Model Transformations

Model transformations are able to migrate pipelines between platform-specific and platform-independent representations (and vice-versa). There are also transformations to merge multiple platform-independent pipeline models into one platform-independent model.

Implemented using ATL and EML.

[/transformations](./cli/src/main/resources/transformations/) contains the ATL files used in model-to-model transformations.

### Code Generation

We generate new pipeline code files from their platform specific models using Acceleo.

[/code-generation](./code-generation/) contains the Acceleo projects for M2T transformations.

### Validating Models

Whenever models need to be validated (e.g., when running strict mode). We use OCL.

[/validations](./cli/src/main/resources/validations/) contains the OCL files used for validating models.

### Command-Line Interface

All previously mentioned technologies are integrated into one cohesive CLI. The reengineering process is automatic.

[/cli](./cli/) contains the source code for the command line interface and the logic to integrate the various modeling projects into one cohesive program

## Publications

- [A Two-Level Model-Driven Approach for Reengineering CI/CD Pipelines](https://www.inforum.pt/static/files/papers/INForum_2024_paper_22.pdf). André Flores, Hugo Gião, Vasco Amaral, and Jácome Cunha. _INForum '24_.
- [Chronicles of CI/CD: A Deep Dive into its Usage Over Time](https://dreflo.github.io/auto-cicd-migration/doc/thesis/msr.pdf). Hugo Gião, André Flores, and Jácome Cunha. _Manuscript submitted for publication_.
- [A Meta-Model to Support the Migration and Evolution of CI/CD Pipelines](https://dreflo.github.io/auto-cicd-migration/doc/thesis/models.pdf). Hugo Gião, André Flores, Jácome Cunha, Vasco Amaral, Rui Pereira, Gregor Engels, and Stefan Sauer. _Manuscript submitted for publication_.
