/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw6;

/**
 *
 * @author Brian
 */
import java.awt.*;
import javax.swing.*;

public class HW6Plot extends JFrame {

  
    
    public HW6Plot() {
        
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        Canvas = new Hw6Canvas();
        xLabel = new javax.swing.JLabel();
        xLabel = new javax.swing.JLabel();
        yLabel = new javax.swing.JLabel();
        xMax = new javax.swing.JTextField();
        xMin = new javax.swing.JTextField();
        yMin = new javax.swing.JTextField();
        yMax = new javax.swing.JTextField();
        colorBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        Canvas.setBackground(new java.awt.Color(255, 255, 255));
        Canvas.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                CanvasMouseDragged(evt);
            }
        });
        Canvas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CanvasMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                CanvasMouseReleased(evt);
            }
        });
        Canvas.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                CanvasPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout CanvasLayout = new javax.swing.GroupLayout(Canvas);
        Canvas.setLayout(CanvasLayout);
        CanvasLayout.setHorizontalGroup(
            CanvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        CanvasLayout.setVerticalGroup(
            CanvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        xLabel.setBackground(new java.awt.Color(255, 255, 255));
        xLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        xLabel.setText("X");

        yLabel.setBackground(new java.awt.Color(255, 255, 255));
        yLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        yLabel.setText("f(x) ");
        yLabel.setPreferredSize(new java.awt.Dimension(30, 20));

        xMax.setText("1");
        xMax.setPreferredSize(new java.awt.Dimension(60, 25));
        xMax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xMaxActionPerformed(evt);
            }
        });

        xMin.setText("0");
        xMin.setPreferredSize(new java.awt.Dimension(60, 25));
        xMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xMinActionPerformed(evt);
            }
        });

        yMin.setText("0");
        yMin.setPreferredSize(new java.awt.Dimension(60, 25));
        yMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yMinActionPerformed(evt);
            }
        });

        yMax.setText("1");
        yMax.setPreferredSize(new java.awt.Dimension(60, 25));
        yMax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yMaxActionPerformed(evt);
            }
        });

        colorBox.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        colorBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Red", "Black", "Blue", "Yellow", "Green" }));
        colorBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(yMin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(yMax, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(yLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(xMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(145, 145, 145)
                        .addComponent(xLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(xMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Canvas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(colorBox, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(130, Short.MAX_VALUE)
                .addComponent(yLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Canvas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(yMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(yMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(colorBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(xLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
        );

        Canvas.getAccessibleContext().setAccessibleName("");
        Canvas.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//    double xBef; 
//    double xAft;
//    double yBef;
//    double yAft;
     double xPt;
     double yPt;
     boolean dragged = false;
    private void CanvasPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_CanvasPropertyChange
           //make changes to the plot canvas here
           Hw6Canvas hw = (Hw6Canvas) Canvas;   //cast the canvas (var name of japnel to Hw6Canvas
           hw.setAxis(new double[]{-1, 1, -.5, 1});
           Plottable2D myFun = new MyFunction();
           hw.setFunction(myFun);
    }//GEN-LAST:event_CanvasPropertyChange

    private void yMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yMinActionPerformed
        Hw6Canvas hw = (Hw6Canvas) Canvas;
        double x1, x2, y1, y2;
        x1 = Double.parseDouble(xMin.getText());
        x2 = Double.parseDouble(xMax.getText());
        y1 = Double.parseDouble(yMin.getText());
        y2 = Double.parseDouble(yMax.getText());
        hw.setAxis(new double[] {x1,x2,y1,y2});
        hw.repaint();
    }//GEN-LAST:event_yMinActionPerformed

    private void xMaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xMaxActionPerformed
        Hw6Canvas hw = (Hw6Canvas) Canvas;
        double x1, x2, y1, y2;
        x1 = Double.parseDouble(xMin.getText());
        x2 = Double.parseDouble(xMax.getText());
        y1 = Double.parseDouble(yMin.getText());
        y2 = Double.parseDouble(yMax.getText());
        hw.setAxis(new double[] {x1,x2,y1,y2});
        hw.repaint();
    }//GEN-LAST:event_xMaxActionPerformed

    private void colorBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorBoxActionPerformed
        Hw6Canvas hw = (Hw6Canvas) Canvas;
        switch((String)colorBox.getSelectedItem()){
            case "Black":
                hw.setLineColor(Color.black);
                hw.repaint();
                break;
            case "Red":
                hw.setLineColor(Color.red);
                hw.repaint();
                break;
            case "Blue":
                hw.setLineColor(Color.blue);
                hw.repaint();
                break;
            case "Yellow":
                hw.setLineColor(Color.yellow);
                hw.repaint();
                break;
            case "Green":
                hw.setLineColor(Color.green);
                hw.repaint();
                break;
        }
    }//GEN-LAST:event_colorBoxActionPerformed

    private void xMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xMinActionPerformed
        Hw6Canvas hw = (Hw6Canvas) Canvas;
        double x1, x2, y1, y2;
        x1 = Double.parseDouble(xMin.getText());
        x2 = Double.parseDouble(xMax.getText());
        y1 = Double.parseDouble(yMin.getText());
        y2 = Double.parseDouble(yMax.getText());
        hw.setAxis(new double[] {x1,x2,y1,y2});
        hw.repaint();
    }//GEN-LAST:event_xMinActionPerformed

    private void yMaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yMaxActionPerformed
        Hw6Canvas hw = (Hw6Canvas) Canvas;
        double x1, x2, y1, y2;
        x1 = Double.parseDouble(xMin.getText());
        x2 = Double.parseDouble(xMax.getText());
        y1 = Double.parseDouble(yMin.getText());
        y2 = Double.parseDouble(yMax.getText());
        hw.setAxis(new double[] {x1,x2,y1,y2});
        hw.repaint();
    }//GEN-LAST:event_yMaxActionPerformed

    
    
    private void CanvasMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CanvasMouseDragged
        Hw6Canvas hw = (Hw6Canvas) Canvas;
        double x1, x2, y1, y2;
        
        if(SwingUtilities.isLeftMouseButton(evt)){
            x1 = Double.parseDouble(xMin.getText());
            x2 = Double.parseDouble(xMax.getText());
            y1 = Double.parseDouble(yMin.getText());
            y2 = Double.parseDouble(yMax.getText()); 
            double xLen = x2-x1;
            double yLen = y2-y1;
            double divX = xLen / 2.0;
            double divY = yLen / 2.0;
            double xPoint = xLen * ((double)evt.getX() / Canvas.getWidth());     //x location relative to axis
            double yPoint = yLen * ((double)(Canvas.getHeight() - (double)evt.getY()) / Canvas.getHeight());
            if (xPoint < divX){
                x2 = x2 - (divX - xPoint);
                x1 = x1 - (divX - xPoint);
            }
            else {
                x2 = x2 + (xPoint - divX);
                x1 = x1 + (xPoint - divX);
            }
            
            if (yPoint < divY){
                y2 = y2 - (divY - yPoint);
                y1 = y1 - (divY - yPoint);
            }
            else{
                y2 = y2 + (yPoint - divY);
                y1 = y1 + (yPoint - divY);
            }
            xMin.setText(Double.toString(x1));
            xMax.setText(Double.toString(x2));
            yMin.setText(Double.toString(y1));
            yMax.setText(Double.toString(y2));
            hw.setAxis(new double[] {x1,x2,y1,y2});
            repaint();
            this.dragged = true;
        }
//        x1 = Double.parseDouble(xMin.getText());
//        x2 = Double.parseDouble(xMax.getText());
//        y1 = Double.parseDouble(yMin.getText());
//        y2 = Double.parseDouble(yMax.getText());
//        if(SwingUtilities.isLeftMouseButton(evt)){
//            xAft = evt.getX();
//            yAft = evt.getY();
//        }
//        x1 += (xAft -xBef);
//        x2 += (xAft - xBef);
//        y1 += (yAft - yBef);
//        y2 += (yAft - yBef);
//        hw.setAxis(new double[] {x1,x2,y1,y2});
//        hw.repaint();
    }//GEN-LAST:event_CanvasMouseDragged

    private void CanvasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CanvasMouseClicked
//        Hw6Canvas hw = (Hw6Canvas) Canvas;
//        double x1, x2, y1, y2;
//       
//        if (SwingUtilities.isLeftMouseButton(evt)){
//            x1 = Double.parseDouble(xMin.getText());
//            x2 = Double.parseDouble(xMax.getText());
//            y1 = Double.parseDouble(yMin.getText());
//            y2 = Double.parseDouble(yMax.getText());
//            double xLen = x2-x1;
//            double yLen = y2-y1;
//            double xPoint = xLen * ((double)evt.getX() / Canvas.getWidth());     //x location relative to axis
//            double yPoint = yLen * ((double)(Canvas.getHeight() - (double)evt.getY()) / Canvas.getHeight());
//            x1 = xPoint - ((xLen/2) *.5);
//            x2 = xPoint + ((xLen/2) * .5);
//            y1 = yPoint - ((yLen/2) * .5);
//            y2 = yPoint + ((yLen/2) * .5);
//            hw.setAxis(new double[] {x1,x2,y1,y2});
//            xMin.setText(Double.toString(x1));
//            xMax.setText(Double.toString(x2));
//            yMin.setText(Double.toString(y1));
//            yMax.setText(Double.toString(y2));
//            
//            repaint();
//        }
//        
//        if (SwingUtilities.isRightMouseButton(evt)){
//            x1 = Double.parseDouble(xMin.getText());
//            x2 = Double.parseDouble(xMax.getText());
//            y1 = Double.parseDouble(yMin.getText());
//            y2 = Double.parseDouble(yMax.getText());
//            double xLen = x2-x1;
//            double yLen = y2-y1;
//            double xPoint = xLen * ((double)evt.getX() / Canvas.getWidth());     //x location relative to axis
//            double yPoint = yLen * ((double)(Canvas.getHeight() - (double)evt.getY()) / Canvas.getHeight());
//            x1 = xPoint - ((double)(xLen/2)*1.1);
//            x2 = xPoint + ((double)(xLen/2)*1.1);
//            y1 = yPoint - ((double)(yLen/2)*1.1);
//            y2 = yPoint + ((double)(yLen/2)*1.1);
//            xMin.setText(Double.toString(x1));
//            xMax.setText(Double.toString(x2));
//            yMin.setText(Double.toString(y1));
//            yMax.setText(Double.toString(y2));
//            hw.setAxis(new double[] {x1,x2,y1,y2});
//            repaint();
//        }
        
    }//GEN-LAST:event_CanvasMouseClicked

    private void CanvasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CanvasMouseReleased
        Hw6Canvas hw = (Hw6Canvas) Canvas;
        double x1, x2, y1, y2;
         
       if (dragged == false){
        if (SwingUtilities.isLeftMouseButton(evt)){
            x1 = Double.parseDouble(xMin.getText());
            x2 = Double.parseDouble(xMax.getText());
            y1 = Double.parseDouble(yMin.getText());
            y2 = Double.parseDouble(yMax.getText());
            double xLen = x2-x1;
            double yLen = y2-y1;
            double xPoint = xLen * ((double)evt.getX() / Canvas.getWidth());     //x location relative to axis
            double yPoint = yLen * ((double)(Canvas.getHeight() - (double)evt.getY()) / Canvas.getHeight());
            x1 = xPoint - ((xPoint - x1) *.5);
            x2 = xPoint + ((x2 - xPoint) * .5);
            y1 = yPoint - ((yPoint - y1) * .5);
            y2 = yPoint + ((y2 - yPoint) * .5);
            hw.setAxis(new double[] {x1,x2,y1,y2});
            xMin.setText(Double.toString(x1));
            xMax.setText(Double.toString(x2));
            yMin.setText(Double.toString(y1));
            yMax.setText(Double.toString(y2));
            
            repaint();
        }
       }
        if (SwingUtilities.isRightMouseButton(evt)){
            x1 = Double.parseDouble(xMin.getText());
            x2 = Double.parseDouble(xMax.getText());
            y1 = Double.parseDouble(yMin.getText());
            y2 = Double.parseDouble(yMax.getText());
            double xLen = x2-x1;
            double yLen = y2-y1;
            double xPoint = xLen * ((double)evt.getX() / Canvas.getWidth());     //x location relative to axis
            double yPoint = yLen * ((double)(Canvas.getHeight() - (double)evt.getY()) / Canvas.getHeight());
            x1 = xPoint - ((double)(xPoint - x1)*2);
            x2 = xPoint + ((double)(x2 - xPoint)*2);
            y1 = yPoint - ((double)(yPoint - y1)*2);
            y2 = yPoint + ((double)(y2 -yPoint)*2);
            xMin.setText(Double.toString(x1));
            xMax.setText(Double.toString(x2));
            yMin.setText(Double.toString(y1));
            yMax.setText(Double.toString(y2));
            hw.setAxis(new double[] {x1,x2,y1,y2});
            repaint();
        }
    }//GEN-LAST:event_CanvasMouseReleased

    
    
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
            java.util.logging.Logger.getLogger(HW6Plot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HW6Plot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HW6Plot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HW6Plot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new HW6Plot().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Canvas;
    private javax.swing.JComboBox<String> colorBox;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel xLabel;
    private javax.swing.JTextField xMax;
    private javax.swing.JTextField xMin;
    private javax.swing.JLabel yLabel;
    private javax.swing.JTextField yMax;
    private javax.swing.JTextField yMin;
    // End of variables declaration//GEN-END:variables
}
