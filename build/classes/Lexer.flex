import compilerTools.Token;

%%
%class Lexer
%type Token
%line
%column
%{
    private Token token(String lexeme, String lexicalComp, int line, int column){
        return new Token(lexeme, lexicalComp, line+1, column+1);
    }
%}
/* Variables básicas de comentarios y espacios */
C=([0-9]){1,5}  
L=[!(START)]|[!(END)]|[!(INTEGER)]|[!(DECIMAL)]|[!(READ)]|[!(PRINT)]|[!(ADD)]|[!(SUB)]|[!(MUL)]|[!(DIV)]|[0-9a-zA-Z]+[0-9a-zA-Z]+
//S=([?]|[a-zA-Z])+
D=[a-zA-Z]([0-9]){1,3}
E=([0-9]){1,5}[.]([0-9]){1,2}
B=([0-9]){6,100}[.]([0-9]){1,100}
BB=([0-9]){1,100}[.]([0-9]){3,100}
BBB=[0-9.]+
LL=[a-zA-Z?¿%$#/@*&:><~.¡!]+
TerminadorDeLinea = \r|\n|\r\n
EntradaDeCaracter = [^\r\n]
EspacioEnBlanco = {TerminadorDeLinea} | [ \t\f]
ComentarioTradicional = "/*" [^*] ~"*/" | "/*" "*"+ "/"
FinDeLineaComentario = "//" {EntradaDeCaracter}* {TerminadorDeLinea}?
ContenidoComentario = ( [^*] | \*+ [^/*] )*
ComentarioDeDocumentacion = "/**" {ContenidoComentario} "*"+ "/"
Comentario = {ComentarioTradicional} | {FinDeLineaComentario} | {ComentarioDeDocumentacion}

%%
{Comentario}|{EspacioEnBlanco} { /*Ignorar*/ }
"{" { return token(yytext(), "tk_LlaveQueAbre", yyline, yycolumn); }
"}" { return token(yytext(), "tk_LlaveQueCierra", yyline, yycolumn); }
"(" { return token(yytext(), "tk_ParentesisQueAbre", yyline, yycolumn); }
")" { return token(yytext(), "tk_ParentesisQueCierra", yyline, yycolumn); }
";" { return token(yytext(), "tk_PuntoyComa", yyline, yycolumn); }
"." { return token(yytext(), "tk_Punto", yyline, yycolumn); }
"=" { return token(yytext(), "tk_Igual", yyline, yycolumn); }
"," { return token(yytext(), "tk_Coma", yyline, yycolumn); }


END { return token(yytext(), "tk_Final", yyline, yycolumn); }
START { return token(yytext(), "tk_Inicio", yyline, yycolumn); }



DECIMAL { return token(yytext(), "tk_decimal", yyline, yycolumn); }

INTEGER { return token(yytext(), "tk_entero", yyline, yycolumn); }

READ |
PRINT { return token(yytext(), "tk_IO", yyline, yycolumn); }

ADD |
SUB |
MUL |
DIV { return token(yytext(), "tk_Operador", yyline, yycolumn); }

({D}) { return token(yytext(), "tk_Identificador", yyline, yycolumn); }
({C}) { return token(yytext(), "tk_Numero", yyline, yycolumn); }
({L}) { return token(yytext(), "tk_Palabra", yyline, yycolumn); }
({E}) { return token(yytext(), "tk_NumeroReal", yyline, yycolumn); }
({B}) { return token(yytext(), "tk_ValNumeroReal", yyline, yycolumn); }
({BB}) { return token(yytext(), "tk_ValNumeroReal2", yyline, yycolumn); }
({BBB}) { return token(yytext(), "tk_ValNumeroReal3", yyline, yycolumn); }
({LL}) { return token(yytext(), "tk_NoValida", yyline, yycolumn); }

. { return token(yytext(), "tk_ERROR", yyline, yycolumn); }