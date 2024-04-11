# CLI

## Building

```
gradle installDist
```

## Running

```
.\cli.bat -il INPUT_LANGUAGE -ol OUTPUT_LANGUAGE [-i INPUT_FILE] [-o OUTPUT_FILE] [-v] [-ef EXTENSION_FILE] [-lf LOG_FILE]
```

If ```-i``` or ```-o``` are not provided the program will read from ```stdin``` and write to ```stdout``` respectively.