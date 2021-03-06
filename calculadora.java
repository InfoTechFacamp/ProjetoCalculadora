/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.axis.NumberTickUnit;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.statistics.HistogramDataset;
import org.jfree.data.statistics.HistogramType;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author heito
 */
public class calculadora extends javax.swing.JFrame {

    /**
     * Creates new form calculadora
     */
    DefaultTableModel model = new DefaultTableModel();

    public calculadora() {
        initComponents();
        TextFieldImportar.setDocument(new SoNumeros());
        model.addColumn("Valores");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaDados = new javax.swing.JTable();
        BotaoLimpar = new javax.swing.JButton();
        BotaoImportar = new javax.swing.JButton();
        separador = new javax.swing.JTextField();
        Lbeldelimitador = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Moda = new javax.swing.JTextField();
        media = new javax.swing.JTextField();
        coefdevariacao = new javax.swing.JTextField();
        DesvioPadrao = new javax.swing.JTextField();
        Mediana = new javax.swing.JTextField();
        variancia = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        LabelImportarvalor = new javax.swing.JLabel();
        TextFieldImportar = new javax.swing.JTextField();
        BotaoAdicionar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora Estat??stica");
        setBackground(new java.awt.Color(102, 71, 148));

        TabelaDados.setAutoCreateRowSorter(true);
        TabelaDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Valores"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaDados.getTableHeader().setReorderingAllowed(false);
        TabelaDados.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                TabelaDadosComponentAdded(evt);
            }
        });
        TabelaDados.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TabelaDadosKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(TabelaDados);
        if (TabelaDados.getColumnModel().getColumnCount() > 0) {
            TabelaDados.getColumnModel().getColumn(0).setResizable(false);
        }

        BotaoLimpar.setText("Limpar");
        BotaoLimpar.setEnabled(false);
        BotaoLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoLimparActionPerformed(evt);
            }
        });

        BotaoImportar.setText("Importar");
        BotaoImportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoImportarActionPerformed(evt);
            }
        });

        separador.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        separador.setText(";");
        separador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                separadorActionPerformed(evt);
            }
        });

        Lbeldelimitador.setText("Delimitador csv");

        jLabel1.setText("Desvio Padr??o");

        jLabel2.setText("Mediana");

        jLabel3.setText("Moda");

        jLabel4.setText("Coef. de Varia????o");

        jLabel5.setText("M??dia");

        Moda.setEditable(false);

        media.setEditable(false);

        coefdevariacao.setEditable(false);

        DesvioPadrao.setEditable(false);

        Mediana.setEditable(false);
        Mediana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MedianaActionPerformed(evt);
            }
        });

        variancia.setEditable(false);

        jLabel6.setText("Vari??ncia");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DesvioPadrao, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                    .addComponent(Mediana)
                    .addComponent(media)
                    .addComponent(Moda)
                    .addComponent(coefdevariacao)
                    .addComponent(variancia, javax.swing.GroupLayout.Alignment.LEADING)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Mediana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DesvioPadrao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(media, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Moda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(variancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(coefdevariacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BotaoImportar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotaoLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Lbeldelimitador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotaoLimpar)
                    .addComponent(BotaoImportar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(separador)
                    .addComponent(Lbeldelimitador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        LabelImportarvalor.setText("Importar Valor");

        TextFieldImportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldImportarActionPerformed(evt);
            }
        });
        TextFieldImportar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TextFieldImportarKeyPressed(evt);
            }
        });

        BotaoAdicionar.setText("Adicionar");
        BotaoAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoAdicionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelImportarvalor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextFieldImportar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotaoAdicionar)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelImportarvalor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TextFieldImportar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoAdicionar))
                .addContainerGap())
        );

        jPanel4.setLayout(new java.awt.BorderLayout());

        jPanel5.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 181, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void BotaoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoLimparActionPerformed

        int x = model.getRowCount();

        for (int deletar = x - 1; deletar >= 0; deletar--) {
            model.removeRow(deletar);
        }
        TabelaDados.setModel(model);
        BotaoLimpar.setEnabled(false);

    }//GEN-LAST:event_BotaoLimparActionPerformed
    File arquivo;
    private void BotaoImportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoImportarActionPerformed
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Arquivo CSV ou TXT", "csv", "txt");
        chooser.setFileFilter(filter);
        if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            arquivo = chooser.getSelectedFile();
        } else {
            arquivo = null;
        }
        BotaoLimpar.setEnabled(true);
        if (arquivo.getName().endsWith(".txt")) {
            try {
                FileReader reader = new FileReader(arquivo);
                BufferedReader buffer = new BufferedReader(reader);
                String linha = buffer.readLine();
                StringTokenizer token = new StringTokenizer(linha);
                while (linha != null) {
                    token = new StringTokenizer(linha);
                    String row[] = new String[token.countTokens()];
                    for (int i = 0; i < row.length; i++) {
                        row[i] = token.nextToken();
                    }

                    model.addRow(row);
                    linha = buffer.readLine();
                }
                TabelaDados.setModel(model);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            try {
                String delimitador = separador.getText();
                if (delimitador.length() != 1) {
                    throw new Exception("Force??a um delimitador v??lido!(apenas uma caractere)");
                }
                FileReader reader = new FileReader(arquivo);
                BufferedReader buffer = new BufferedReader(reader);
                String linha = buffer.readLine();
                StringTokenizer token = new StringTokenizer(linha, delimitador);
                String header[] = new String[token.countTokens()];
                for (int i = 0; i < header.length; i++) {
                    header[i] = token.nextToken();
                }
                DefaultTableModel model = new DefaultTableModel(header, 0);
                linha = buffer.readLine();
                while (linha != null) {
                    token = new StringTokenizer(linha, delimitador);
                    String row[] = new String[token.countTokens()];
                    for (int i = 0; i < row.length; i++) {
                        row[i] = token.nextToken();
                    }
                    model.addRow(row);
                    linha = buffer.readLine();
                }
                TabelaDados.setModel(model);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        }
        DecimalFormat df = new DecimalFormat("#.###");
        df.setRoundingMode(RoundingMode.UP);
        Mediana.setText(String.valueOf(df.format(median(TableDataDouble()))));
        Moda.setText(String.valueOf(df.format(mode(TableDataDouble()))));
        DesvioPadrao.setText(String.valueOf(df.format(getDesvioPadrao())));
        media.setText(String.valueOf(df.format(getMean(TableDataDouble()))));
        variancia.setText(String.valueOf(df.format(getVariancia())));
        coefdevariacao.setText(String.valueOf(df.format(getCoefficientOfVariation())));
        jPanel4.removeAll();
        try {
            JFreeChart chart = ChartFactory.createXYLineChart(
                    "Gr??fico",
                    "",
                    "",
                    createXYDataset(),
                    PlotOrientation.VERTICAL,
                    false,
                    true,
                    false
            );
            chart.setBackgroundPaint(Color.white);
            XYPlot plot = chart.getXYPlot();
            plot.setBackgroundPaint(Color.lightGray);
            plot.setDomainGridlinePaint(Color.white);
            plot.setRangeGridlinePaint(Color.white);
            NumberAxis axis = (NumberAxis) plot.getDomainAxis();
            axis.setTickUnit(new NumberTickUnit(10));
            ChartPanel chartPanel = new ChartPanel(chart);
            chartPanel.setPreferredSize(jPanel4.getSize());
            jPanel4.add(chartPanel, java.awt.BorderLayout.CENTER);
            this.getContentPane().validate();
            this.getContentPane().repaint();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(),
                    "ERRO", JOptionPane.ERROR_MESSAGE);
        }

        jPanel5.removeAll();
        createHistogram(TableDataDouble());
    }//GEN-LAST:event_BotaoImportarActionPerformed

    private void BotaoAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoAdicionarActionPerformed
        String Valor = TextFieldImportar.getText();
        model.insertRow(0, new Object[]{Valor});
        TabelaDados.setModel(model);
        BotaoLimpar.setEnabled(true);
        DecimalFormat df = new DecimalFormat("#.###");
        df.setRoundingMode(RoundingMode.UP);
        Mediana.setText(String.valueOf(df.format(median(TableDataDouble()))));
        Moda.setText(String.valueOf(df.format(mode(TableDataDouble()))));
        DesvioPadrao.setText(String.valueOf(df.format(getDesvioPadrao())));
        media.setText(String.valueOf(df.format(getMean(TableDataDouble()))));
        variancia.setText(String.valueOf(df.format(getVariancia())));
        coefdevariacao.setText(String.valueOf(df.format(getCoefficientOfVariation())));
        jPanel4.removeAll();
        try {
            JFreeChart chart = ChartFactory.createXYLineChart(
                    "Gr??fico",
                    "",
                    "",
                    createXYDataset(),
                    PlotOrientation.VERTICAL,
                    false,
                    true,
                    false
            );
            chart.setBackgroundPaint(Color.white);
            XYPlot plot = chart.getXYPlot();
            plot.setBackgroundPaint(Color.lightGray);
            plot.setDomainGridlinePaint(Color.white);
            plot.setRangeGridlinePaint(Color.white);
            NumberAxis axis = (NumberAxis) plot.getDomainAxis();
            axis.setTickUnit(new NumberTickUnit(10));
            ChartPanel chartPanel = new ChartPanel(chart);
            chartPanel.setPreferredSize(jPanel4.getSize());
            jPanel4.add(chartPanel, java.awt.BorderLayout.CENTER);
            this.getContentPane().validate();
            this.getContentPane().repaint();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(),
                    "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        jPanel5.removeAll();
        createHistogram(TableDataDouble());
    }//GEN-LAST:event_BotaoAdicionarActionPerformed

    public JFreeChart createHistogram(double[] doubleMatrix) {

        ArrayList<Double> dataArrayList = new ArrayList<Double>();

        for (int i = 0; i < doubleMatrix.length; i++) {

            double value = doubleMatrix[i];
            if (Double.isNaN(value)) {
                continue;
            } else {
                dataArrayList.add(value);
            }
            System.out.println(value);
        }

        double[] data = new double[dataArrayList.size()];

        for (int p = 0; p < dataArrayList.size(); p++) {
            data[p] = dataArrayList.get(p);
        }

        HistogramDataset dataset = new HistogramDataset();
        dataset.setType(HistogramType.RELATIVE_FREQUENCY);
        dataset.addSeries("Hist", data, 50);
        String plotTitle = "";
        String xAxis = "Frequencia";
        String yAxis = "";
        PlotOrientation orientation = PlotOrientation.VERTICAL;

        boolean show = false;
        boolean toolTips = false;
        boolean urls = false;
        JFreeChart chart = ChartFactory.createHistogram(plotTitle, xAxis, yAxis,
                dataset, orientation, show, toolTips, urls);
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(jPanel5.getSize());
        jPanel5.add(chartPanel, java.awt.BorderLayout.CENTER);

        chart.setBackgroundPaint(Color.white);
        this.getContentPane().validate();
        this.getContentPane().repaint();

        return chart;
    }

    private void TextFieldImportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldImportarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldImportarActionPerformed

    private void TextFieldImportarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextFieldImportarKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldImportarKeyPressed

    private void separadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_separadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_separadorActionPerformed

    private void TabelaDadosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TabelaDadosKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_DELETE) {
            int selecionado;
            selecionado = TabelaDados.getSelectedRow();
            ((DefaultTableModel) TabelaDados.getModel()).removeRow(selecionado);
        }
        if (TabelaDados.getRowCount() == 0) {
            BotaoLimpar.setEnabled(false);
        }
    }//GEN-LAST:event_TabelaDadosKeyPressed

    private void MedianaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MedianaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MedianaActionPerformed

    private void TabelaDadosComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_TabelaDadosComponentAdded

    }//GEN-LAST:event_TabelaDadosComponentAdded

    public static int mode(double a[]) {
        int maxValue = 0, maxCount = 0;

        for (int i = 0; i < a.length; ++i) {
            int count = 0;
            for (int j = 0; j < a.length; ++j) {
                if (a[j] == a[i]) {
                    ++count;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                maxValue = (int) a[i];
            }
        }

        return maxValue;
    }

    public static double median(double[] m) {
        int middle = m.length / 2;
        if (m.length % 2 == 1) {
            return m[middle];
        } else {
            return (m[middle - 1] + m[middle]) / 2.0;
        }
    }

    public static double mean(double[] m) {
        double sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i];
        }
        return sum / m.length;
    }

    public Object[][] getTableData(JTable table) {
        TableModel dtm = table.getModel();
        int nRow = dtm.getRowCount(), nCol = dtm.getColumnCount();
        Object[][] tableData = new Object[nRow][nCol];
        for (int i = 0; i < nRow; i++) {
            for (int j = 0; j < nCol; j++) {
                tableData[i][j] = dtm.getValueAt(i, j);
            }
        }
        return tableData;
    }

    public double[] TableDataDouble() {
        int linhas = model.getRowCount();
        double dados[] = new double[linhas];
        try {
            for (int g = 0; g != linhas; g++) {
                dados[g] = Double.parseDouble(String.valueOf(model.getValueAt(g, 0)));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        Arrays.sort(dados);
        return dados;
    }

    public static double getStandardDeviation(double[] data) {
        final double mean = getMean(data);
        double sum = 0;
        for (int index = 0; index != data.length; ++index) {
            sum += Math.pow(Math.abs(mean - data[index]), 2);
        }
        return Math.sqrt(sum / data.length);
    }

    public static double getMean(double[] data) {
        if (data.length == 0) {
            return 0;
        }
        double sum = 0.0;
        for (int index = 0; index != data.length; ++index) {
            sum += data[index];
        }
        return sum / data.length;
    }

    public static double getVariance(double[] data) {
        double mean = 0.0;
        for (int i = 0; i < data.length; i++) {
            mean += data[i];
        }
        double variance = 0;
        for (int i = 0; i < data.length; i++) {
            variance += Math.pow(data[i] - mean, 2);
        }
        variance /= data.length;
        return variance;
    }

    private XYDataset createXYDataset() {
        XYSeriesCollection dataset = new XYSeriesCollection();
        XYSeries serie = new XYSeries("Dados");
        int n = model.getRowCount();
        int linhas = model.getRowCount();
        double dados[] = new double[linhas];
        for (int g = 0; g != linhas; g++) {
            dados[g] = Double.parseDouble(String.valueOf(model.getValueAt(g, 0)));
        }
        for (int i = 0; i < n; i++) {
            serie.add(i + 1, dados[i]);
        }
        dataset.addSeries(serie);
        return dataset;
    }

    public double getCoefficientOfVariation() {
        double s = getDesvioPadrao();
        double x = getMean(TableDataDouble());
        double cv = (s / x) * 100;
        return cv;
    }

    public Double getDesvioPadrao() {
        Double media = getMean(TableDataDouble());
        double tudo[] = TableDataDouble();
        int tam = tudo.length;
        Double desvPadrao = 0D;
        for (Double vlr : tudo) {
            Double aux = vlr - media;
            desvPadrao += aux * aux;
        }
        return Math.sqrt(desvPadrao / (tam - 1));
    }

    public double getVariancia() {
        double array[] = TableDataDouble();
        double p1 = 1 / Double.valueOf(array.length - 1);
        double p2 = getSomaDosElementosAoQuadrado()
                - (Math.pow(getSomaDosElementos(), 2) / Double
                .valueOf(array.length));
        return p1 * p2;
    }

    public double getSomaDosElementosAoQuadrado() {
        double array[] = TableDataDouble();
        double total = 0;
        for (int counter = 0; counter < array.length; counter++) {
            total += Math.pow(array[counter], 2);
        }
        return total;
    }

    public double getSomaDosElementos() {
        double array[] = TableDataDouble();
        double total = 0;
        for (int counter = 0; counter < array.length; counter++) {
            total += array[counter];
        }
        return total;
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
            java.util.logging.Logger.getLogger(calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new calculadora().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoAdicionar;
    private javax.swing.JButton BotaoImportar;
    private javax.swing.JButton BotaoLimpar;
    private javax.swing.JTextField DesvioPadrao;
    private javax.swing.JLabel LabelImportarvalor;
    private javax.swing.JLabel Lbeldelimitador;
    private javax.swing.JTextField Mediana;
    private javax.swing.JTextField Moda;
    private javax.swing.JTable TabelaDados;
    private javax.swing.JTextField TextFieldImportar;
    private javax.swing.JTextField coefdevariacao;
    private javax.swing.JFileChooser jFileChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField media;
    private javax.swing.JTextField separador;
    private javax.swing.JTextField variancia;
    // End of variables declaration//GEN-END:variables
}
