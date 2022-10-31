# Reactive Java API Playground

## Table of contents

* [Reactive Java API Playground](#reactive-java-api-playground)
  * [<em>Table of contents</em>](#table-of-contents)
  * [<em>Summary</em>](#summary)
  * [<em>How to install</em>](#how-to-install)
  * [<em>How to build</em>](#how-to-build)
    * [Local build](#local-build)
    * [Docker build](#docker-build)
  * [<em>How to run</em>](#how-to-run)
    * [Local run](#local-run)
    * [Docker run](#docker-run)
  * [<em>Issues</em>](#issues)
  * [<em>Authors</em>](#authors)
  * [<em>Licensing</em>](#licensing)
  * [<em>Links</em>](#links)

## Summary

The project consists of the following submodules:

* [**Annotations**](https://github.com/AlexRogalskiy/reactive-java-api-playground/blob/master/modules/annotations) `annotations`
  - Module with custom annotations.
* [**BOM**](https://github.com/AlexRogalskiy/reactive-java-api-playground/blob/master/modules/bom) `bom`
  - Bill of materials for general set of available modules.
* [**Commons**](https://github.com/AlexRogalskiy/reactive-java-api-playground/blob/master/modules/commons) `commons`
  - Module with common utilities and tools.
* [**Extensions**](https://github.com/AlexRogalskiy/reactive-java-api-playground/blob/master/modules/extensions) `extensions`
  - Module with supported processing extensions.
* [**Flow Implementation**](https://github.com/AlexRogalskiy/reactive-java-api-playground/blob/master/modules/flow-impl) `flow-impl`
  - Module with Flow API implementation.
* [**Reactor Implementation**](https://github.com/AlexRogalskiy/reactive-java-api-playground/blob/master/modules/reactor-impl) `reactor-impl`
  - Module with Reactor API implementation.
* [**Interfaces**](https://github.com/AlexRogalskiy/reactive-java-api-playground/blob/master/modules/interfaces) `interfaces`
  - Module with general API contracts.
* [**Samples**](https://github.com/AlexRogalskiy/reactive-java-api-playground/blob/master/modules/samples) `samples`
  - Module with project's samples.

## How to install

```bash
git clone https://github.com/AlexRogalskiy/reactive-java-api-playground
cd reactive-java-api-playground
```

## How to build

### Local build

To make the application build locally the following command should be executed:

```bash
make local-build
```

### Docker build

To make the application build in `Docker` container the following command should be executed:

```bash
make docker-build
```

## How to run

### Local run

To make the application running locally the following command should be executed:

```bash
make local-run
```

### Docker run

To make the application running in docker container the following command should be executed:

```bash
make docker-up
```

To stop docker container:

```bash
make docker-down
```

To view docker containers logs (in live mode):

```bash
make docker-logs
```

## Issues

No issues currently available

## Authors

***Reactive Java API playground*** is maintained by the following GitHub team-members:

[![Author](https://img.shields.io/badge/author-AlexRogalskiy-FB8F0A)](https://github.com/AlexRogalskiy)

with community support please contact with us if you have some question or proposition.

## Licensing

***Reactive Java API playground*** is distributed under MIT license.

The detailed information can be presented at 
[license agreement](https://github.com/AlexRogalskiy/reactive-java-api-playground/blob/master/LICENSE.txt)

## Links

No links currently available
