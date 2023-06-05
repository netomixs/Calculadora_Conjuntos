
package Principal;

import java.lang.reflect.Array;
import java.util.ArrayList;
import static java.util.Arrays.asList;
import java.util.List;

/**
 *
 * @author netom
 */
public class Calculadora extends javax.swing.JFrame {

    Operaciones operaciones;
    String universoStr, lenguajesStr;
    List<Lenguaje> listaux;

    public Calculadora() {
        initComponents();
        listaux = new ArrayList();
        this.resultadoEditTExt.setLineWrap(true);
        this.resultadoEditTExt.setWrapStyleWord(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        UniversoEditText = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        LenguajesEditText = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        errorLengLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        erroruniversoLabel = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        OperacionEditText = new javax.swing.JTextField();
        calcularBtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        unionBtn = new javax.swing.JButton();
        interseccionBtn = new javax.swing.JButton();
        dSimetricaBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultadoEditTExt = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        errorFormatoOperacion = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(851, 500));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel3.setText("U={");

        UniversoEditText.setColumns(20);
        UniversoEditText.setRows(5);
        UniversoEditText.setText("a,b,#,/,1,3,5,f,h,g,?,6,77,9,$");
        jScrollPane2.setViewportView(UniversoEditText);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel1.setText("}");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel2.setText("Ejemplo: Universo ={1,2,3,a,b,c,..,..}");

        LenguajesEditText.setColumns(20);
        LenguajesEditText.setRows(5);
        LenguajesEditText.setText("{a1,#,f,/,3}\n{a,5,ff,#}\n{1,3,5,h,b}\n{h,/,#,b}\n{ab,f,$,9,a1}\n{5,ff,h,b,$,77}\n{/,##,b,h,1}\n{b,ff,f,##,$}\n");
        jScrollPane3.setViewportView(LenguajesEditText);

        jLabel4.setText("Lenguajes=");

        jLabel5.setText("{1,2,3,c}{b,d,a,1}{}....{}");

        jLabel7.setText("Ejemplo:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(errorLengLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorLengLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5))
                .addContainerGap())
        );

        erroruniversoLabel.setText(" ");

        jLabel8.setText("Operación");

        OperacionEditText.setText("(L6*L8)*L5");
        OperacionEditText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OperacionEditTextActionPerformed(evt);
            }
        });

        calcularBtn.setText("Calcular");
        calcularBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularBtnActionPerformed(evt);
            }
        });

        jPanel3.setLayout(new java.awt.GridLayout(2, 2, 2, 2));

        unionBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Principal/union.png"))); // NOI18N
        unionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unionBtnActionPerformed(evt);
            }
        });
        jPanel3.add(unionBtn);

        interseccionBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Principal/interseccion.png"))); // NOI18N
        interseccionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                interseccionBtnActionPerformed(evt);
            }
        });
        jPanel3.add(interseccionBtn);

        dSimetricaBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Principal/diferecionSimetrica.png"))); // NOI18N
        dSimetricaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dSimetricaBtnActionPerformed(evt);
            }
        });
        jPanel3.add(dSimetricaBtn);

        resultadoEditTExt.setColumns(20);
        resultadoEditTExt.setRows(5);
        resultadoEditTExt.setWrapStyleWord(true);
        jScrollPane1.setViewportView(resultadoEditTExt);

        jLabel10.setText("Resultado:");

        jLabel9.setText("*=Klenn; +=Positiva; .=multiplicacion C= Complemento");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(errorFormatoOperacion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(OperacionEditText, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(calcularBtn))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 62, Short.MAX_VALUE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(OperacionEditText, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calcularBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorFormatoOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(erroruniversoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(404, 404, 404)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(erroruniversoLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dSimetricaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dSimetricaBtnActionPerformed
        agregarTexoAOperacio("∆");
    }//GEN-LAST:event_dSimetricaBtnActionPerformed

    private void interseccionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_interseccionBtnActionPerformed
        agregarTexoAOperacio("∩");
    }//GEN-LAST:event_interseccionBtnActionPerformed

    private void unionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unionBtnActionPerformed
        agregarTexoAOperacio("U");
    }//GEN-LAST:event_unionBtnActionPerformed

    private void calcularBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularBtnActionPerformed
        recojerTextos();
        formatearString();
        int corchetes = verificarCorchete(lenguajesStr);
        resultadoEditTExt.setText("");
        erroruniversoLabel.setText("");
        if (this.universoStr.contains(",,")) {
            errorLengLabel.setText("No quiero tener elementos vacios en el universo");
        } else if (this.universoStr.contains("{}")) {
            errorLengLabel.setText("No quiero tener elementos vacios lenguajes");
        } else if (!caracteresValidos(this.universoStr).isEmpty()) {
            erroruniversoLabel.setText("El caracter " + caracteresValidos(this.universoStr) + " no es un caracter permitido");
        } else if (corchetes != 0) {
            errorLengLabel.setText("Existe un error de formato");
        } else {
            operaciones = new Operaciones(universoStr, lenguajesStr);
            int[] lenguajeDuplicado = operaciones.duplicadosLenguaje();
            int universoDuplicado = operaciones.duplicadosUniverso();
            if (lenguajeDuplicado[0] == -1) {
                int[] error = operaciones.verificar();
                if (error[0] != -1) {
                    errorLengLabel.setText("Existe un error en el Lenguaje " + (error[0] + 1) + ",elemento " + (error[1] + 1));
                } else {
                    if (universoDuplicado == -1) {
                        operaciones.unificar();
                        operaciones.mostrarTodo();
                        calcular();
                    } else {
                        erroruniversoLabel.setText("Objeto duplicado en elemnto " + (universoDuplicado + 1));
                    }
                }
                operaciones.mostrarTodo();
            } else {
                errorLengLabel.setText("Objetos duplicados en lenguaje " + (lenguajeDuplicado[0] + 1) + " Elemento " + (lenguajeDuplicado[1] + 1));
            }

        }
        
    }//GEN-LAST:event_calcularBtnActionPerformed

    private void OperacionEditTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OperacionEditTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OperacionEditTextActionPerformed
    void agregarTexoAOperacio(String str) {
        String text = OperacionEditText.getText() + str;
        OperacionEditText.setText(text);
    }

    // Comprueba que el universo solo utilizara caracteres permitidos
    String caracteresValidos(String op) {
        for (int i = 0; i < op.length(); i++) {
            if (!Opciones.universoCaracteres.contains(op.charAt(i) + "")) {
                return op.charAt(i) + "";
            }
        }
        return "";
    }

    void recojerTextos() {
        this.universoStr = UniversoEditText.getText();
        this.lenguajesStr = LenguajesEditText.getText();
    }

    //Elimina todos los espacio y saltos de lineas de los strings a trabajas
    void formatearString() {
        this.universoStr = this.universoStr.replaceAll(" ", "");
        this.universoStr = this.universoStr.replaceAll("\n", "");
        UniversoEditText.setText(this.universoStr);

        this.lenguajesStr = this.lenguajesStr.replaceAll(" ", "");
        LenguajesEditText.setText(this.lenguajesStr);
        this.lenguajesStr = this.lenguajesStr.replaceAll("\n", "");
    }

    // Verifica que los parentesis fueron colocados correctamente
    int verificarParentesisi(String str) {
        int num = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                num++;
            }
            if (str.charAt(i) == ')') {
                num--;
            }
        }
        return num;
    }

    int verificarCorchete(String str) {
        int num = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '{') {
                num++;
            }
            if (str.charAt(i) == '}') {
                num--;
            }
        }
        return num;
    }

    /// Metodo que se ejecuta si los formatos y regles se cumplieron
    void calcular() {
        try {
            errorFormatoOperacion.setText("");
            errorLengLabel.setText("");
            listaux = new ArrayList();
            String operacion = OperacionEditText.getText();
            operacion = operacion.replaceAll(" ", "");
            if (verificarParentesisi(operacion) == 0) {
                validarCaracteres(operacion);
         
                // determinarOrdesOperacion(determinar(operacion));
                determinarOrdesOperacion(determinar(operacion));
            } else {
                errorFormatoOperacion.setText("Parentesis mal colocados");
            }
        } catch (Exception e) {

        }
    }
// Convierte el String a valores usables
    //Ejemplo (L1UL2)=[(,1,U,2,)]

    ArrayList determinar(String operacion) {
        ArrayList elementos = new ArrayList();
        boolean isNumero = false;
        String numStr = "";
        int num = 0;

        for (int i = 0; i < operacion.length();) {
          
            //Si numero esta activo significa que el = indice es un numero
            if (isNumero) {
                //Se concatenan todos los posibles numeros
                while (operacion.charAt(i) >= 48 && operacion.charAt(i) <= 57) {
                    numStr += operacion.charAt(i);
                    if ((i + 1) < operacion.length()) {
                        if (operacion.charAt(i + 1) >= 48 && operacion.charAt(i + 1) <= 57) {
                            i++;

                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
                }//Se convierte en Int y se agrega al Array
                num = Integer.parseInt(numStr);
                elementos.add(num);
                isNumero = false;
                numStr = "";
                i++;
                // Si se detecta una L numero se vuelve verdadreo
            } else if (operacion.charAt(i) == 'L') {
                isNumero = true;
                i++;
            } else {
                // En todo caso se agrega los operadores y parentesis
                elementos.add(operacion.charAt(i));
                i++;
            }
        }
        return elementos;
    }

    ArrayList limpiarParentesisInutiles(ArrayList arr) {
        if(!arr.contains('(')){
            
        }else{
        try {
            int nada = 0;
            while (nada == 0) {
                nada++;
                for (int i = 0; i < arr.size(); i++) {
                    if (arr.get(i).equals('(') && arr.get(i + 2).equals(')')) {
                        arr.remove(i);
                        arr.remove(i + 1);
                        nada = 0;
                    }
                }

            }
        } catch (Exception e) {
            resultadoEditTExt.setText("No se puede resolver");
        }
        }
        return arr;
    }

    //Recorre la operacion y va seleccionado que operaciones realizar primero
    void determinarOrdesOperacion(ArrayList arr) {
        int inicio = 0, fin = 0;
        int res = 0;
        while (arr.size() > 1) {
            //Si una operacion este encerrara entre parentesis la ejeuctara primero
            // Se busca el largo de la operacion con parentesis
            //inicio y final inidices donde se abren los parentesis y se cierran  
        
            arr = limpiarParentesisInutiles(arr);
           
            if (arr.contains('(')) {
                for (int i = 0; i < arr.size(); i++) {
                    if (arr.get(i).equals('(')) {
                        inicio = i;
                    } else if (arr.get(i).equals(')')) {
                        fin = i;
                        break;
                    }
                }
               
              for(int i=inicio;i<fin;i++){
                  String str=arr.get(i).toString();
                    if(str.equals("C")||str.equals("*")||str.equals("+")){
                        res = elejirOperacion(new ArrayList(arr.subList(i-1, i+1)));
                          
                        arr.set(i-1, res);
                        arr.remove(i);
        
                      
                    }
                    
                      arr=limpiarParentesisInutiles(arr);
                
                }
                
              if(arr.size()>1){
                   
                     // Se selecciona los elementos 1,2,3 que correspondes a los incices de los lenguajes(0,2) y la operacion(1)
                // se llama al metodo y se recupera el indice donde se guarda el resultado (1,U,2)
              
                res = elejirOperacion(new ArrayList(arr.subList(inicio + 1, inicio + 4)));

                // Se remplaza el elemnto 1 con el resultado y se elimina el resto de la operacion incluido que la componian
                arr.set(inicio + 1, res);
                for (int i = inicio + 2; i <= inicio + 3; i++) {
                    arr.remove(inicio + 2);
                }
              }

              
            } else if (arr.size() > 1) {
                for(int i=0;i<arr.size();i++){
                     String str=arr.get(i).toString();
                    if(str.equals("C")||str.equals("*")||str.equals("+")){
                        res = elejirOperacion(new ArrayList(arr.subList(i-1, i+1)));
                      
                        arr.set(i-1, res);
                        arr.remove(i);
                    } 
                }
               
                if(arr.size()>1){
                          // EN caso de no contener parentesis se toma que el indice 0 y  2 contienen los conjuntos
                inicio = 0;
                fin = 3;
                   
                // Se envia la parte del arreglo que contine los 3 valores para la operacion
                res = elejirOperacion(new ArrayList(arr.subList(inicio, 3)));
                //Se asigna a 0 el conjunto resultante
                arr.set(inicio, res);
                // Se elimina los otros 2 valores;
                for (int i = inicio + 1; i < fin; i++) {
                   
                    arr.remove(inicio + 1);
                }
                }
               
            }
            
             
        }
     
        //Se muestran los resultado
        try {
            if (Integer.parseInt(arr.get(0).toString()) > operaciones.Lenguajes.size()) {
                resultadoEditTExt.setText(asList(listaux.get(Integer.parseInt(arr.get(0).toString()) - operaciones.Lenguajes.size() - 1).arr).toString());
                    
            } else {
                resultadoEditTExt.setText(asList(operaciones.Lenguajes.get(Integer.parseInt(arr.get(0).toString()) - 1).arr).toString());
                  
            }

        } catch (Exception e) {
              
        }
       
    }

//Dependiendo el arreglo que ingrese se seleccionara una operacion
    int elejirOperacion(ArrayList arr) {
        try {
            if (arr.size() == 2) {
                 List<String> a;
                 int c1 = Integer.parseInt(arr.get(0).toString());
                  a = elejirConjunto(c1);
                switch (arr.get(1).toString()) {
                    case "C":
                        listaux.add(listaux.size(), new Lenguaje(operaciones.complemento(a)));
                        break;
                    case "*":
                         listaux.add(listaux.size(), new Lenguaje(operaciones.kleen(a, 0)));
                        ;
                        break;
                    case "+":
                       listaux.add(listaux.size(), new Lenguaje(operaciones.positivo(a, 0)));
                        break;
                    default:
                        throw new AssertionError();
                }
               
                
               
                
            } else if (arr.size() == 3) {
                List<String> a, b;
                int c1 = Integer.parseInt(arr.get(0).toString());
                int c2 = Integer.parseInt(arr.get(2).toString());
                /*          if(c1>operaciones.Lenguajes.size() || (c1>operaciones.Lenguajes.size()+listaux.size()-1&&c1>operaciones.Lenguajes.size())){
                resultadoEditTExt.setText("No se puede hacer la operacion" +(operaciones.Lenguajes.size()+listaux.size()-1));
            }
            else if(c2>operaciones.Lenguajes.size() || (c2>operaciones.Lenguajes.size()+listaux.size()-1&&c2>operaciones.Lenguajes.size())){
                resultadoEditTExt.setText("No se puede hacer la operacion"+(operaciones.Lenguajes.size()));  
            }else{*/

                a = elejirConjunto(c1);
                b = elejirConjunto(c2);

                switch (arr.get(1).toString()) {
                    case "U":
                        listaux.add(listaux.size(), new Lenguaje(operaciones.union(a, b)));
                        break;
                    case "∩":
                        listaux.add(listaux.size(), new Lenguaje(operaciones.interseccion(a, b)));

                        break;
                    case "∆":
                        listaux.add(listaux.size(), new Lenguaje(operaciones.diferenciaSimetrica(a, b)));
                        break;
                    case"-":
                     listaux.add(listaux.size(), new Lenguaje(operaciones.diferencia(a, b)));
                        break;
                    case ".":
                     listaux.add(listaux.size(), new Lenguaje(operaciones.multiplicacion(a, b)));
                        break;
                }

            }
        } catch (Exception e) {
            return 0;
        }

        // Los valores calculados se guardan en un lista listaaux, para indicar esto se retorna el incide mas el numero
        //De lenguajes para diferneciarlo de un lenguaje
        
        return operaciones.Lenguajes.size() + listaux.size();
    }

    //Selecciona si se ve usar un conjunto Lenguaje o un conjunto ya operado
    List<String> elejirConjunto(int num) {
        if (num <= operaciones.Lenguajes.size()) {
            List<String> a;
            return asList(operaciones.Lenguajes.get(num - 1).arr);
        } else {
            return asList(listaux.get(num - operaciones.Lenguajes.size() - 1).arr);
        }
    }
//Impide que se ingresen caracteres no contemplados

    boolean validarCaracteres(String operacion) {
        for (int i = 0; i < operacion.length(); i++) {
            if (!Opciones.caracteres.contains(operacion.charAt(i) + "")) {
                errorFormatoOperacion.setText("Este caracter no es valido+ \"" + operacion.charAt(i) + "\"");
                return false;
            }
        }
        return true;
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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea LenguajesEditText;
    private javax.swing.JTextField OperacionEditText;
    private javax.swing.JTextArea UniversoEditText;
    private javax.swing.JButton calcularBtn;
    private javax.swing.JButton dSimetricaBtn;
    private javax.swing.JLabel errorFormatoOperacion;
    private javax.swing.JLabel errorLengLabel;
    private javax.swing.JLabel erroruniversoLabel;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton interseccionBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea resultadoEditTExt;
    private javax.swing.JButton unionBtn;
    // End of variables declaration//GEN-END:variables
}