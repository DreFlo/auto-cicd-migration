@echo off

:: Iterate through files in the ..\test\tests directory
for %%f in (..\test\tests\*.*ml) do (
    echo Running %%f
    call .\cli.bat -i %%f -il gha -ol circleci -ef .\transformation-scripts\00.tdsl | .\cli.bat -il circleci -ol gha -o ..\test\converted_circleci\%%~nxf
)
