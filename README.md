# Mini Pascal Compiler

The next project was created to obtain an engineer degree.

The project was developed using:

- Java 8.
- Maven.
- JFlex.
- Cup Parser.

Is very easy to understand and a good introduction to compilers.

## Grammar

The project use a context free grammar. Here is the grammar.

```
PROGRAM             ::= procedure HEADER BODY
HEADER              ::= IDENTIFIER is
BODY                ::= DECLARATIONS BLOCK
DECLARATIONS        ::= IDENTIFIER : Integer ; |
                        IDENTIFIER : Integer ; DECLARATIONS
BLOCK               ::= begin STATEMENTS end;
STATEMENTS          ::= STATEMENT |
                        STATEMENT STATEMENTS
STATEMENT           ::= ASSIGMENT_STATEMENT |
                        FOR_STATEMENT |
                        IF_STATEMENT |
                        INPUT_STATEMENT |
                        OUTPUT_STATEMENT |
                        NULL_STATEMENT
ASSIGMENT_STATEMENT ::= IDENTIFIER := EXPRESSION;
FOR_STATEMENT       ::= for IDENTIFIER in CONSTANT to CONSTANT
                        loop
                            STATEMENTS
                        endloop
IF_STATEMENT        ::= if EXPRESSION then
                            STATEMENTS
                        else
                            STATEMENTS
                        endif
INPUT_STATEMENT     ::= input(IDENTIFIER)
OUTPUT_STATEMENT    ::= output(IDENTIFIER)
NULL_STATEMENT      ::= null
EXPRESSION          ::= TERMN |
                        ADD_OP
TERMN               ::= FACTOR |
                        MULT_OP
FACTOR              ::= IDENTIFIER |
                        (EXPRESSION) |
                        CONSTANT
IDENTIFIER          ::= a | b | c | ... | z
ADD_OP              ::= EXPRESSION + TERMN |
                        EXPRESSION - TERMN
MULT_OP             ::= TERMN * FACTOR |
                        TERMN / FACTOR
CONSTANT            ::= DIGIT |
                        DIGIT CONSTANT
DIGIT               ::= 0 | 1 | 2 | ... | 9
```

After that, is necesary to configure `*.flex` and `*.cup` files that contains lexical and sintactical configuration.

## To use

To use the project you can set a `File` object or set the `String` path. The extension file needs to be `*.ps`