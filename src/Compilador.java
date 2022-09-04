
import com.formdev.flatlaf.FlatIntelliJLaf;
import compilerTools.CodeBlock;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import compilerTools.Directory;
import compilerTools.ErrorLSSL;
import compilerTools.Functions;
import compilerTools.Grammar;
import compilerTools.Production;
import compilerTools.TextColor;
import compilerTools.Token;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.AEADBadTagException;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author herschel
 */
public class Compilador extends javax.swing.JFrame {

    private String title;
    private Directory directorio;
    private ArrayList<Token> tokens;
    private ArrayList<ErrorLSSL> errors;
    private ArrayList<TextColor> textsColor;
    private Timer timerKeyReleased;
    private ArrayList<Production> identProd;
    private ArrayList<Production> allProd;
    private HashMap<String, String> identificadores;
    private boolean codeHasBeenCompiled = false;
    private String tokensString = "";
    private String sintactico = "";

    /**
     * Creates new form Compilador
     */
    public Compilador() {
        initComponents();
        init();
    }

    private void init() {
        title = "Compiler";
        setLocationRelativeTo(null);
        setTitle(title);
        directorio = new Directory(this, jtpCode, title, ".comp");
        addWindowListener(new WindowAdapter() {// Cuando presiona la "X" de la esquina superior derecha
            @Override
            public void windowClosing(WindowEvent e) {
                directorio.Exit();
                System.exit(0);
            }
        });
        Functions.setLineNumberOnJTextComponent(jtpCode);
        timerKeyReleased = new Timer((int) (1000 * 0.3), (ActionEvent e) -> {
            timerKeyReleased.stop();

        });
        Functions.insertAsteriskInName(this, jtpCode, () -> {
            timerKeyReleased.restart();
        });
        tokens = new ArrayList<>();
        errors = new ArrayList<>();
        textsColor = new ArrayList<>();
        identProd = new ArrayList<>();
        identificadores = new HashMap<>();
        allProd = new ArrayList<>();
        Functions.setAutocompleterJTextComponent(new String[]{}, jtpCode, () -> {
            timerKeyReleased.restart();
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rootPanel = new javax.swing.JPanel();
        buttonsFilePanel = new javax.swing.JPanel();
        btnAbrir = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnGuardarC = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtpCode = new javax.swing.JTextPane();
        panelButtonCompilerExecute = new javax.swing.JPanel();
        btnCompilar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtaOutputConsole = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblTokens = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        btnAbrir.setText("Abrir");
        btnAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirActionPerformed(evt);
            }
        });

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnGuardarC.setText("Guardar como");
        btnGuardarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttonsFilePanelLayout = new javax.swing.GroupLayout(buttonsFilePanel);
        buttonsFilePanel.setLayout(buttonsFilePanelLayout);
        buttonsFilePanelLayout.setHorizontalGroup(
            buttonsFilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonsFilePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAbrir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardarC)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        buttonsFilePanelLayout.setVerticalGroup(
            buttonsFilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonsFilePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buttonsFilePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAbrir)
                    .addComponent(btnNuevo)
                    .addComponent(btnGuardar)
                    .addComponent(btnGuardarC))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jtpCode);

        btnCompilar.setText("Compilar");
        btnCompilar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompilarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelButtonCompilerExecuteLayout = new javax.swing.GroupLayout(panelButtonCompilerExecute);
        panelButtonCompilerExecute.setLayout(panelButtonCompilerExecuteLayout);
        panelButtonCompilerExecuteLayout.setHorizontalGroup(
            panelButtonCompilerExecuteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelButtonCompilerExecuteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCompilar)
                .addGap(84, 84, 84))
        );
        panelButtonCompilerExecuteLayout.setVerticalGroup(
            panelButtonCompilerExecuteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelButtonCompilerExecuteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCompilar)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        jtaOutputConsole.setEditable(false);
        jtaOutputConsole.setBackground(new java.awt.Color(255, 255, 255));
        jtaOutputConsole.setColumns(20);
        jtaOutputConsole.setRows(5);
        jScrollPane2.setViewportView(jtaOutputConsole);

        tblTokens.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Componente léxico", "Lexema", "[Línea, Columna]"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblTokens);

        javax.swing.GroupLayout rootPanelLayout = new javax.swing.GroupLayout(rootPanel);
        rootPanel.setLayout(rootPanelLayout);
        rootPanelLayout.setHorizontalGroup(
            rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rootPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, rootPanelLayout.createSequentialGroup()
                        .addComponent(buttonsFilePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelButtonCompilerExecute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 693, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 693, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
                .addGap(17, 17, 17))
        );
        rootPanelLayout.setVerticalGroup(
            rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rootPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonsFilePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelButtonCompilerExecute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(rootPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(rootPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        getContentPane().add(rootPanel);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        directorio.New();
        clearFields();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirActionPerformed
        if (directorio.Open()) {

            clearFields();
        }
    }//GEN-LAST:event_btnAbrirActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (directorio.Save()) {
            clearFields();
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnGuardarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCActionPerformed
        if (directorio.SaveAs()) {
            clearFields();
        }
    }//GEN-LAST:event_btnGuardarCActionPerformed

    private void btnCompilarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompilarActionPerformed
        if (getTitle().contains("*") || getTitle().equals(title)) {
            if (directorio.Save()) {
                compile();
            }
        } else {
            compile();
        }
    }//GEN-LAST:event_btnCompilarActionPerformed

    private void compile() {
        clearFields();
        analisisLexico();
        fillTableTokens();
        analisisSintactico();
        analisisSemantico();
        printConsole();
        codeHasBeenCompiled = true;
    }

    private void analisisLexico() {
        // Extraer tokens
        Lexer lexer;
        try {
            File codigo = new File("code.encrypter");
            FileOutputStream output = new FileOutputStream(codigo);
            byte[] bytesText = jtpCode.getText().getBytes();
            output.write(bytesText);
            BufferedReader entrada = new BufferedReader(new InputStreamReader(new FileInputStream(codigo), "UTF8"));
            lexer = new Lexer(entrada);
            while (true) {
                Token token = lexer.yylex();

                if (token == null) {
                    break;
                }
                System.out.println("Lexema: " + token.getLexeme());
                System.out.println("Comp lexico: " + token.getLexicalComp());

                tokensString += "(" + token.getLexeme() + "," + token.getLexicalComp() + ")\n";
                generarArchivoLexemaToken(tokensString);

                /*Si detecta algun error lexico lo envia al ArrayList de errores para posteriormente ser mostrado*/
                if (token.getLexicalComp().equals("tk_ERROR") || token.getLexicalComp().equals("tk_NoValida") || token.getLexicalComp().equals("tk_Palabra")) {
                    ErrorLSSL elssl = new ErrorLSSL(1, "Error: el token " + token.getLexeme() + " no pertenece al lenguaje", token);
                    errors.add(elssl);
                } else {
                    tokens.add(token);
                }

            }
        } catch (FileNotFoundException ex) {
            System.out.println("El archivo no pudo ser encontrado... " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Error al escribir en el archivo... " + ex.getMessage());
        }
    }

    private void analisisSintactico() {
        Grammar gramatica = new Grammar(tokens, errors);
        ArrayList<Production> errores = new ArrayList<>();

        /*Eliminacion de errores*/
        gramatica.delete(new String[]{"tk_ERROR", "tk_NoValida", "tk_Palabra"}, 1);

        /*agrupacion de inicio*/
        gramatica.group("Inicio", "tk_Inicio tk_LlaveQueAbre", true, allProd);

        gramatica.group("Inicio", "tk_Inicio", true, 1, "Error sintactico: falta la llave que abre despues de START en la linea # ", errores);
        // gramatica.group("Inicio", "tk_LlaveQueAbre", true, 1, "Error sintactico: falta la palabra reservada START antes de la llave que abre en la linea # ");

        gramatica.group("Tipo", "tk_entero|tk_decimal", true);

        /*Agrupacion de valores*/
        gramatica.group("Valor", "tk_Numero|tk_NumeroReal|tk_ValNumeroReal|tk_ValNumeroReal2|tk_ValNumeroReal3", true);

        /*Agrupacion de Operaciones y definicion de parametros */
        gramatica.group("Operacion", "tk_Operador tk_ParentesisQueAbre (Valor|tk_Identificador) tk_Coma (Valor|tk_Identificador) tk_ParentesisQueCierra");
        gramatica.group("Operacion", "tk_Operador tk_ParentesisQueAbre (Valor|tk_Identificador|(Operacion)+) tk_Coma (Valor|tk_Identificador|(Operacion)+) tk_ParentesisQueCierra");

        gramatica.group("Operacion", "tk_Operador tk_ParentesisQueAbre tk_Coma (Valor|tk_Identificador|(Operacion)+) tk_ParentesisQueCierra", true, 1, "Error sintactico: falta el primer parametro en la linea # ", errores);
        gramatica.group("Operacion", "tk_Operador tk_ParentesisQueAbre (Valor|tk_Identificador|(Operacion)+) tk_Coma tk_ParentesisQueCierra", true, 1, "Error sintactico: falta el segundo parametro en la linea # ", errores);

        gramatica.group("Asignacion", "tk_Identificador tk_Igual (Operacion|tk_Identificador|Valor)");
        gramatica.group("Asignacion", "tk_Identificador (Operacion|tk_Identificador|Valor)", true, 1, "Error sintactico: Falta el operador = despues del indentificador en la linea #", errores);
        gramatica.group("Asignacion", "tk_Igual (Operacion|tk_Identificador|Valor)", true, 1, "Error sintactico: Falta el identificador antes del = en la linea #");

        /* agrupacion de funciones IO */
        gramatica.group("FuncionIO", "tk_IO tk_ParentesisQueAbre (Valor|tk_Identificador) tk_ParentesisQueCierra");
        gramatica.group("FuncionIO", "tk_IO tk_ParentesisQueAbre tk_ParentesisQueCierra", true, 1, "Error sintactico: Falta el parametro entre el parentesis que abre y el parentesis que cierra en la linea # ", errores);


        /*Declaracion de variables*/
        gramatica.group("Multideclaracion", "(tk_Identificador|Asignacion) ((tk_Coma (tk_Identificador|Asignacion))+)?");

        //gramatica.group("Multideclaracion", "Multideclaracion (Valor|tk_Identificador|Multideclaracion)((tk_Coma tk_Identificador (tk_Igual (Valor|tk_Identificador|Multideclaracion))?)+)?", true, 1, "Error sintactico: falta el operador de asignacion = o la coma , despues del identificador en la linea # ", errores);
        //gramatica.group("Multideclaracion", "Multideclaracion tk_Igual ((tk_Coma tk_Identificador (tk_Igual (Valor|tk_Identificador))?)+)?", true, 1, "Error sintactico falta el valor despues del = en la linea # ", errores);
        //gramatica.group("Multideclaracion", "tk_Igual (Valor|(tk_Identificador|Multideclaracion))((tk_Coma tk_Identificador (tk_Igual (Valor|(Multideclaracion|tk_Identificador)))?)+)?", true, 1, "Error sintactico falta el identificador antes del = en la linea # ", errores);
        gramatica.group("Declaracion", "Tipo Multideclaracion");

        // gramatica.group("Declaracion", "Multideclaracion", true, 1, "Error sintactico: falta el tipo de dato antes del identificador en la linea # ", errores);

        /*Eliminacion de tipos de dato y operadores de asignacion*/
        // gramatica.delete("tk_tipo", 1, "Error sintactico el tipo de dato no esta en una declaracion en la linea # ");
        // gramatica.delete("tk_Igual", 1, "Error sintactico el operador de asignacion no esta en una declaracion en la linea # ");

        /*Eliminacion de funciones incompletas*/
        gramatica.delete("tk_IO", 1, "Error sintactico la funcion no esta declarada correctamente en la linea # ");
        gramatica.delete("tk_Operador", 1, "Error sintactico la funcion no esta declarada correctamente en la linea # ");
        /*Eliminacion de parentesis*/
        gramatica.delete(new String[]{"tk_ParentesisQueAbre", "tk_ParentesisQueCierra"}, 1, "Error sintactico: el parentesis no forma parte de la sentencia en la linea # ");

        /*Verificacion de punto y coma*/
        gramatica.group("Operacion_PC", "Operacion tk_PuntoyComa", true, identProd);

        gramatica.group("Operacion_PC", "Operacion", true, 1, "Error sintactico: falta el punto y coma en la linea # ", errores);

        gramatica.group("FuncionIO_PC", "FuncionIO tk_PuntoyComa", true, allProd);
        gramatica.group("FuncionIO_PC", "FuncionIO", true, 1, "Error sintactico: falta el punto y coma en la linea # ", errores);

        gramatica.group("Multideclaracion_PC", "Multideclaracion tk_PuntoyComa", true, allProd);
        gramatica.group("Multideclaracion_PC", "Multideclaracion", true, 1, "Error sintactico: falta el punto y coma en la linea # ", errores);

        gramatica.group("Declaracion_PC", "Declaracion tk_PuntoyComa", true, allProd);
        gramatica.group("Declaracion_PC", "Declaracion", true, 1, "Error sintactico: falta el punto y coma en la linea # ", errores);

        /*eliminacion ;*/
        gramatica.delete("tk_PuntoyComa", 1, "Error sintactico: no se esperaba el ; en la linea #");
        /*agrupar codigo*/
        gramatica.group("Codigo", "Operacion_PC|FuncionIO_PC|Multideclaracion_PC|Declaracion_PC", true, allProd);

        /*agrupar final*/
        gramatica.group("Fin", "tk_LlaveQueCierra tk_Final", true, allProd);
        gramatica.group("Fin", "tk_Final", true, 1, "Error sintactico: falta la llave que cierra antes de END en la linea # ", errores);

        gramatica.delete(new String[]{"tk_LlaveQueAbre", "tk_LlaveQueCierra"}, 1, "Error sintactico: la llave  no forma parte de la sentencia en la linea # ");

        gramatica.delete("tk_Coma", 1, "Error sintactico: no se esperaba una , en la linea #");

        gramatica.delete("Tipo", 1, "Error sintactico el tipo de dato no esta en una declaracion en la linea # ");
        gramatica.delete("tk_Igual", 1, "Error sintactico el operador de asignacion no esta en una declaracion en la linea # ");

        // gramatica.group("Fin", "tk_LlaveQueCierra", true, 1, "Error sintactico: falta la palabra reservada END despues de la llave en la linea # ");
        /*agrupar programa*/
        gramatica.group("Programa", "Inicio (Codigo)+ Fin", true, allProd);
        gramatica.group("Programa", "Inicio Fin", true, 1, "Error sintactico: falta incluir codigo dentro del programa", errores);
        gramatica.group("Programa", "Inicio (Codigo)+", true, 1, "Error sintactico: falta la instruccion de cierre de programa }END", errores);
        gramatica.group("Programa", "(Codigo)+ Fin", true, 1, "Error sintactico: falta la instruccion de apertura de programa START{", errores);
        gramatica.delete("(Codigo)+", 1, "Error sintactico: falta la instruccion de apertura de programa START{ y la instruccion de cierre de programa }END");
        gramatica.delete("Inicio", 1, "Error sintactico: falta incluir codigo dentro del programa y cerrar el programa con }END");
        gramatica.delete("Fin", 1, "Error sintactico: falta incluir codigo dentro del programa y abrir el programa con START{");

        /* Mostrar gramáticas */
        System.out.println("SHOWWWW");
        gramatica.show();

        if (errores.isEmpty()) {
            arbolSitactico();

        }

        // generaArbolSintactico();
//        try {
//           // generarArbolSintactico();
//            generaArbolSintactico();
//        } catch (IOException ex) {
//            Logger.getLogger(Compilador.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }

    private void arbolSitactico() {
        FileWriter fw = null;
        String salida = "";
        int numero = 1;
        String padre = "@Token";
        String padreDePadre = "@Produccion";
        ArrayList<Integer> padres = new ArrayList<>();
        ArrayList<Integer> codigo = new ArrayList<>();

        try {

            int posPrograma = 0;
            for (int i = 0; i < allProd.size(); i++) {
                tokens = allProd.get(i).getTokens();

                for (int j = 0; j < tokens.size(); j++) {
                    salida += "(" + numero + "," + tokens.get(j).getLexicalComp() + "," + padre + ")\n";
                    numero++;
                }
                //extraer linea de programa
                if (allProd.get(i).getName().equals("Programa")) {
                    posPrograma = numero;
                }

                if (allProd.get(i).getName().equals("Codigo")) {
                    codigo.add(numero);
                }

                salida += "(" + numero + "," + allProd.get(i).getName() + "," + padreDePadre + ")\n";
                padres.add(numero);
                numero++;

            }
            salida = "";
            numero = 1;

            //ASIGNAR PADRES
            int posicionPadres = 0;
            int posCodigo = 0;

            for (int i = 0; i < allProd.size(); i++) {
                tokens = allProd.get(i).getTokens();

                for (int j = 0; j < tokens.size(); j++) {
                    salida += "(" + numero + "," + tokens.get(j).getLexicalComp() + "," + padres.get(posicionPadres) + ")\n";

                    numero++;
                }
                //asignar hijos de programa
                if (allProd.get(i).getName().equals("Inicio") || allProd.get(i).getName().equals("Codigo") || allProd.get(i).getName().equals("Fin")) {
                    salida += "(" + numero + "," + allProd.get(i).getName() + "," + posPrograma + ")\n";
                } else if (allProd.get(i).getName().equals("Programa")) {
                    salida += "(" + numero + "," + allProd.get(i).getName() + "," + "0" + ")\n";
                } else {

                    salida += "(" + numero + "," + allProd.get(i).getName() + "," + codigo.get(posCodigo) + ")\n";
                    posCodigo++;
                }

                numero++;
                posicionPadres++;

            }

            // asignarPadres(salida);
            //String nuevoArbol = setPadres(salida);
            // salida = nuevoArbol;
            sintactico = salida;
            File archivoLexemaToken = new File("arbolSintactico.txt");
            fw = new FileWriter(archivoLexemaToken);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(salida);
            bw.close();

            // asignaPadres(archivoLexemaToken,padres);
        } catch (IOException ex) {
            Logger.getLogger(Compilador.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(Compilador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void analisisSemantico() {
        ArrayList<Production> declaraciones = new ArrayList<>();
        //OBTENEMOS UNICAMENTE LAS DECLARACIONES
        for (int i = 0; i < allProd.size(); i++) {
            if (allProd.get(i).getName().equals("Declaracion_PC")) {
                declaraciones.add(allProd.get(i));

            }

        }

        //SACAMOS SOLO LOS IDENTIFICADORES QUE HAN SIDO DECLARADOS
        ArrayList<String> variablesDeclaradas = new ArrayList<>();

        for (int i = 0; i < declaraciones.size(); i++) {
            for (int j = 1; j < declaraciones.get(i).getTokens().size(); j++) {

                if (declaraciones.get(i).getTokens().get(j).getLexicalComp().equals("tk_Identificador")) {

                    if ((declaraciones.get(i).getTokens().get(j - 1).getLexicalComp().equals("tk_ParentesisQueAbre")) || (declaraciones.get(i).getTokens().get(j + 1).getLexicalComp().equals("tk_ParentesisQueCierra")) || (declaraciones.get(i).getTokens().get(j - 1).getLexicalComp().equals("tk_Igual"))) {

                    } else {
                        variablesDeclaradas.add(declaraciones.get(i).getTokens().get(j).getLexeme());

                    }

                }
            }
        }

        //SACAMOS LOS INDENTIFICADORES USADOS EN ASIGNACIONES, FUNCIONES
        Set<Token> identi = new HashSet<Token>();

        for (int i = 0; i < allProd.size(); i++) {
            for (int j = 1; j < allProd.get(i).getTokens().size(); j++) {
                if (allProd.get(i).getTokens().get(j).getLexicalComp().equals("tk_Identificador")) {
                    if ((allProd.get(i).getTokens().get(j - 1).getLexicalComp().equals("tk_ParentesisQueAbre")) || (allProd.get(i).getTokens().get(j + 1).getLexicalComp().equals("tk_ParentesisQueCierra")) || (allProd.get(i).getTokens().get(j - 1).getLexicalComp().equals("tk_Igual"))) {
                        identi.add(allProd.get(i).getTokens().get(j));
                    }

                }
            }
        }

        //VALIDAMOS QUE LOS IDENTIFICADORES HAYAN SIDO DECLARADOS
        ArrayList<Token> aux = new ArrayList<>(identi);
        for (int i = 0; i < aux.size(); i++) {
            if (variablesDeclaradas.contains(aux.get(i).getLexeme())) {

            } else {
                errors.add(new ErrorLSSL(1, "Error semantico en la linea " + aux.get(i).getLine() + " la variable " + aux.get(i).getLexeme() + " no se ha declarado", aux.get(i)));
            }
        }

        //VALIDAMOS LOS TIPOS EN LAS DECLARACIONES ENTERAS
        for (int i = 0; i < declaraciones.size(); i++) {
            if (declaraciones.get(i).getTokens().get(0).getLexicalComp().equals("tk_entero")) {
                for (int j = 1; j < declaraciones.get(i).getTokens().size(); j++) {
                    if (declaraciones.get(i).getTokens().get(j).getLexicalComp().equals("tk_NumeroReal")) {
                        errors.add(new ErrorLSSL(1, "Error semantico en la linea " + declaraciones.get(i).getTokens().get(j).getLine() + ": el valor asignado no corresponde con el tipo de dato INTEGER " + declaraciones.get(i).getTokens().get(j).getLexeme(), declaraciones.get(i).getTokens().get(j)));
                    }

                }

            }

        }

        //VALIDAMOS LOS TIPOS EN LAS DECLARACIONES DECIMALES
        for (int i = 0; i < declaraciones.size(); i++) {
            if (declaraciones.get(i).getTokens().get(0).getLexicalComp().equals("tk_decimal")) {
                for (int j = 1; j < declaraciones.get(i).getTokens().size(); j++) {
                    if (declaraciones.get(i).getTokens().get(j).getLexicalComp().equals("tk_Numero")) {
                        errors.add(new ErrorLSSL(1, "Error semantico en la linea " + declaraciones.get(i).getTokens().get(j).getLine() + ": el valor asignado no corresponde con el tipo de dato DECIMAL " + declaraciones.get(i).getTokens().get(j).getLexeme(), declaraciones.get(i).getTokens().get(j)));
                    }

                }

            }

        }

        //VALIDAMOS QUE LOS IDENTIFICADORES NO ESTEN REPETIDOS
        ArrayList<String> identificadores = new ArrayList<>();
        Set<String> ident = new HashSet<String>();
        for (int i = 0; i < declaraciones.size(); i++) {
            for (int j = 1; j < declaraciones.get(i).getTokens().size(); j++) {

                if (declaraciones.get(i).getTokens().get(j).getLexicalComp().equals("tk_Identificador")) {
                    if ((declaraciones.get(i).getTokens().get(j - 1).getLexicalComp().equals("tk_ParentesisQueAbre")) || (declaraciones.get(i).getTokens().get(j + 1).getLexicalComp().equals("tk_ParentesisQueCierra")) || (declaraciones.get(i).getTokens().get(j - 1).getLexicalComp().equals("tk_Igual"))) {

                    } else {
                        boolean noRepetido = ident.add(declaraciones.get(i).getTokens().get(j).getLexeme());
                        if (noRepetido == false) {
                            errors.add(new ErrorLSSL(1, "Error semantico en la linea " + declaraciones.get(i).getTokens().get(j).getLine() + ": ya se ha declarado un identificador con el mismo nombre " + declaraciones.get(i).getTokens().get(j).getLexeme(), declaraciones.get(i).getTokens().get(j)));

                        }
                    }

                }
            }
        }

        //CREAMOS ARRAY CON LOS IDENTIFICADORES Y SU TIPO EN ORDEN
        ArrayList<String> variables = new ArrayList<>();
        ArrayList<String> tipos = new ArrayList<>();

        for (int i = 0; i < declaraciones.size(); i++) {
            for (int j = 1; j < declaraciones.get(i).getTokens().size(); j++) {

                if (declaraciones.get(i).getTokens().get(j).getLexicalComp().equals("tk_Identificador")) {
                    if ((declaraciones.get(i).getTokens().get(j - 1).getLexicalComp().equals("tk_ParentesisQueAbre")) || (declaraciones.get(i).getTokens().get(j + 1).getLexicalComp().equals("tk_ParentesisQueCierra")) || (declaraciones.get(i).getTokens().get(j - 1).getLexicalComp().equals("tk_Igual"))) {

                    } else {
                        variables.add(declaraciones.get(i).getTokens().get(j).getLexeme());
                        tipos.add(declaraciones.get(i).getTokens().get(0).getLexeme());

                    }

                }

            }
        }

        //VAMOS A VALIDAR QUE LAS VARIABLES QUE SE LE ASIGNEN A OTRA VARIABLE CORRESPONDAN A SU TIPO
       

        ArrayList<String> identByLine = new ArrayList<>();

        for (int i = 0; i < allProd.size(); i++) {
            if (allProd.get(i).getName().equals("Codigo")) {
                for (int j = 0; j < allProd.get(i).getTokens().size(); j++) {
                    if (!allProd.get(i).getTokens().get(j).getLexicalComp().equals("tk_PuntoyComa")) {
                        if (allProd.get(i).getTokens().get(j).getLexicalComp().equals("tk_Identificador")) {
                            for (int k = 0; k < variables.size(); k++) {
                                if (variables.get(k).equals(allProd.get(i).getTokens().get(j).getLexeme())) {
                                    identByLine.add(tipos.get(k));
                                }
                            }
                        }
                    } else {
                        if (!identByLine.isEmpty()) {
                            String type = identByLine.get(0);
                            for (int k = 0; k < identByLine.size(); k++) {
                                if (!type.equals(identByLine.get(k))) {
                                    errors.add(new ErrorLSSL(1, "Error semantico en la linea " + allProd.get(i).getTokens().get(j).getLine() + ": el indentificador asignado no corresponde con el tipo de dato " + type, allProd.get(i).getTokens().get(j)));

                                }
                            }
                        }
                        
                        identByLine.clear();
                        
                    }
                }
            }

        }

        System.out.println("Variables = " + variables);
        System.out.println("Tipos = " + tipos);
        generarArbolDecorado(variables, tipos);

    }

    private void generarArbolDecorado(ArrayList<String> variables, ArrayList<String> tipos) {
        FileWriter fw = null;
        String salida = "";
        int numero = 1;
        String padre = "@Token";
        String padreDePadre = "@Produccion";
        ArrayList<Integer> padres = new ArrayList<>();
        ArrayList<Integer> codigo = new ArrayList<>();

        try {

            System.out.println("AllProd: ");
            int posPrograma = 0;
            for (int i = 0; i < allProd.size(); i++) {
                tokens = allProd.get(i).getTokens();

                for (int j = 0; j < tokens.size(); j++) {
                    if (tokens.get(j).getLexicalComp().equals("tk_Identificador")) {
                        salida += "(" + numero + "," + tokens.get(j).getLexeme() + "," + padre + ")\n";
                    } else {
                        salida += "(" + numero + "," + tokens.get(j).getLexicalComp() + "," + padre + ")\n";
                    }
                    numero++;
                }
                //extraer linea de programa
                if (allProd.get(i).getName().equals("Programa")) {
                    posPrograma = numero;
                }

                if (allProd.get(i).getName().equals("Codigo")) {
                    codigo.add(numero);
                }

                salida += "(" + numero + "," + allProd.get(i).getName() + "," + padreDePadre + ")\n";
                padres.add(numero);
                numero++;

            }
            salida = "";
            numero = 1;

            //ASIGNAR PADRES
            int posicionPadres = 0;
            int posCodigo = 0;
            ArrayList<String> funciones = new ArrayList<>();
            for (int i = 0; i < allProd.size(); i++) {
                tokens = allProd.get(i).getTokens();

                for (int j = 0; j < tokens.size(); j++) {
                    if (tokens.get(j).getLexicalComp().equals("tk_Identificador")) {
                        salida += "(" + numero + "," + tokens.get(j).getLexicalComp() + "," + tokens.get(j).getLexeme() + "," + padres.get(posicionPadres) + ")\n";
                    } else {
                        salida += "(" + numero + "," + tokens.get(j).getLexicalComp() + "," + padres.get(posicionPadres) + ")\n";
                    }
                    numero++;
                }

                //recuperamos las variables de las funciones
                if (allProd.get(i).getName().equals("FuncionIO_PC")) {
                    funciones.add(allProd.get(i).getTokens().get(2).getLexeme());
                }

                //asignar hijos de programa
                if (allProd.get(i).getName().equals("Inicio") || allProd.get(i).getName().equals("Codigo") || allProd.get(i).getName().equals("Fin")) {
                    salida += "(" + numero + "," + allProd.get(i).getName() + "," + posPrograma + ")\n";
                } else if (allProd.get(i).getName().equals("Programa")) {
                    salida += "(" + numero + "," + allProd.get(i).getName() + "," + "0" + ")\n";
                } else if (allProd.get(i).getName().equals("Declaracion_PC")) {
                    salida += "(" + numero + "," + allProd.get(i).getName() + "," + allProd.get(i).getTokens().get(0).getLexeme() + "," + codigo.get(posCodigo) + ")\n";
                    posCodigo++;
                } else {
                    salida += "(" + numero + "," + allProd.get(i).getName() + "," + codigo.get(posCodigo) + ")\n";
                    posCodigo++;
                }

                numero++;
                posicionPadres++;

            }

            for (int i = 0; i < variables.size(); i++) {
                if (salida.contains(variables.get(i))) {
                    String nueva = variables.get(i) + "," + tipos.get(i);
                    String aux = salida.replace(variables.get(i), nueva);
                    salida = aux;

                }

            }

            String linea = "";
            String tipo = "";
            for (int i = 0; i < salida.length(); i++) {
                if (salida.charAt(i) != '\n') {
                    linea += salida.charAt(i);
                } else {

                    if (linea.contains("INTEGER")) {
                        tipo = "INTEGER";
                    } else if (linea.contains("DECIMAL")) {
                        tipo = "DECIMAL";
                    }

                    if (linea.contains("FuncionIO_PC")) {
                        String aux = linea.replace("FuncionIO_PC", "FuncionIO_PC," + tipo);
                        String auxsalida = salida.replace(linea, aux);
                        salida = auxsalida;

                    }

                    linea = "";
                }
            }

            sintactico = salida;
            System.out.println("AllProd= " + allProd);
            System.out.println("identProd= " + identProd);
            File archivoLexemaToken = new File("arbolSemantico.txt");
            fw = new FileWriter(archivoLexemaToken);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(salida);
            bw.close();

            // asignaPadres(archivoLexemaToken,padres);
        } catch (IOException ex) {
            Logger.getLogger(Compilador.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
        } finally {
            try {
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(Compilador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void generarArchivoLexemaToken(String tokens) throws IOException {
        File archivoLexemaToken = new File("archivoLexemaToken.txt");
        FileWriter fw = new FileWriter(archivoLexemaToken);
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write(tokens);

        bw.close();
    }

    private void fillTableTokens() {
        tokens.forEach(token -> {
            Object[] data = new Object[]{token.getLexicalComp(), token.getLexeme(), "[" + token.getLine() + ", " + token.getColumn() + "]"};
            Functions.addRowDataInTable(tblTokens, data);
        });
    }

    private void printConsole() {
        int sizeErrors = errors.size();
        if (sizeErrors > 0) {
            Functions.sortErrorsByLineAndColumn(errors);
            String strErrors = "\n";
            for (ErrorLSSL error : errors) {
                String strError = String.valueOf(error);
                strErrors += strError + "\n";
            }
            jtaOutputConsole.setText("Compilación terminada...\n" + strErrors + "\nLa compilación terminó con errores...");
        } else {
            jtaOutputConsole.setText("Compilación terminada...");
        }
        jtaOutputConsole.setCaretPosition(0);
    }

    private void clearFields() {
        Functions.clearDataInTable(tblTokens);
        jtaOutputConsole.setText("");
        tokens.clear();
        errors.clear();
        allProd.clear();
        identProd.clear();
        identificadores.clear();
        codeHasBeenCompiled = false;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Compilador.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Compilador.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Compilador.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Compilador.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(new FlatIntelliJLaf());
            } catch (UnsupportedLookAndFeelException ex) {
                System.out.println("LookAndFeel no soportado: " + ex);
            }
            new Compilador().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbrir;
    private javax.swing.JButton btnCompilar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnGuardarC;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JPanel buttonsFilePanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jtaOutputConsole;
    private javax.swing.JTextPane jtpCode;
    private javax.swing.JPanel panelButtonCompilerExecute;
    private javax.swing.JPanel rootPanel;
    private javax.swing.JTable tblTokens;
    // End of variables declaration//GEN-END:variables
}
