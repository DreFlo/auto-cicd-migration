@echo off

:: Iterate through files in the ..\test\tests directory
for %%f in (..\test\tests\*.*ml) do (
    echo Running %%f
    call .\cli.bat -i %%f -il gha -ol gha -o .\output\%%~nxf
)
