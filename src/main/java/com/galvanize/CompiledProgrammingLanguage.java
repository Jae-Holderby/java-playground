package com.galvanize;

public class CompiledProgrammingLanguage extends ProgrammingLanguage {

    private String compilerCommand = "javac";

    public String getCompilerCommand() {
        return compilerCommand;
    }

    public void setCompilerCommand(String compilerCommand) {
        this.compilerCommand = compilerCommand;
    }

    @Override
    public String toString() {
        return  getName() + " (" +
                "compiled with" + compilerCommand + '\'' +
                ')';
    }
}
