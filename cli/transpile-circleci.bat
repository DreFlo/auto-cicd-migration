@echo off

:: Iterate through files in the ..\test\tests directory
for %%f in (..\test\tests\*.*ml) do (
    :: If %%f is after "t-richards-chemo-dotnet.yml" alphabetically, run if "%%~nxf" geq "tintinweb-smart-contract-storage-viewer-pages.yml" (
    echo Running %%f
    call .\cli.bat -i %%f -il gha -ol circleci -ef .\transformation-scripts\transpile.tdsl -s | .\cli.bat -il circleci -ol gha -o ..\test\converted_circleci_pre_validate\%%~nxf
)
