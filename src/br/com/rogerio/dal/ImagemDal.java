/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rogerio.dal;

import br.com.rogerio.interfaces.Interface_ImagemAlvo;
import java.awt.Image;
import static java.awt.Image.SCALE_SMOOTH;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

/**
 *
 * @author roger
 */
public class ImagemDal implements Interface_ImagemAlvo {

    JFileChooser chooser = new JFileChooser();
    File f;

    public ImagemDal() {
    }

    @Override
    public String carregarPath() throws Exception {
        try {
            chooser.showOpenDialog(null);
            f = chooser.getSelectedFile();
            String caminho = f.getAbsolutePath();
            return caminho;
        } catch (Exception erro) {
            throw new Exception("Erro ao carregar o caminho\n" + erro);
        }
    }

    @Override
    public ImageIcon carregarImagem(String caminho) throws Exception {
        try {
            ImageIcon imageIcon = new ImageIcon(caminho);
            Image image = imageIcon.getImage();
            Image newing = image.getScaledInstance(380, 350, SCALE_SMOOTH);
            ImageIcon icon = new ImageIcon(newing);
            return icon;
        } catch (Exception erro) {
            throw new Exception("Erro ao carregar a imagem\n" + erro);
        }
    }
}
