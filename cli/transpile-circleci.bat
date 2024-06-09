@echo off

:: Iterate through files in the ..\test\tests directory, do it randomly
for %%f in (..\test\tests\*.*ml) do (
    :: If %%f not already converted, convert it
    if not exist ..\test\converted_circleci_pre_validate\%%~nxf (
        echo Running %%f
        call .\cli.bat -i %%f -il gha -ol circleci -ef .\transformation-scripts\transpile.tdsl -s | .\cli.bat -il circleci -ol gha -o ..\test\converted_circleci_pre_validate\%%~nxf
    )
)
