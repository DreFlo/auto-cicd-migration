@echo off

:: Iterate through files in the ..\test\tests directory, do it randomly
for %%f in (..\test\tests\*.*ml) do (
    :: If %%f after jshawl-unqueue-node.js.yml and not already converted, convert it if %%~nxf gtr jshawl-unqueue-node.js.yml
    echo Running %%f
    call .\cli.bat -i %%f -il gha -ol circleci -ef .\transformation-scripts\transpile.tdsl -s | .\cli.bat -il circleci -ol gha -o ..\test\converted_circleci_pre_validate\%%~nxf
)
