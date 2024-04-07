package org.visitorPattern;

public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
 }