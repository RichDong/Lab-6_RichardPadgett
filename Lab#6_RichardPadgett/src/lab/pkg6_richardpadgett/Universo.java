package lab.pkg6_richardpadgett;

import java.awt.Event;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Universo {

    String nombre;
   private ArrayList<Seres_vivos> sv = new ArrayList();
    private File archivo = null;

    public Universo() {
        
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public Universo(String nombre, String path ) {
        this.nombre = nombre;
        archivo = new File(path);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Seres_vivos> getSv() {
        return sv;
    }

    public void setSv(ArrayList<Seres_vivos> sv) {
        this.sv = sv;
    }

    @Override
    public String toString() {
        return "Universo{" + "nombre=" + nombre + ", sv=" + sv + '}';
    }
    public void setArchivo(Seres_vivos s){
        this.sv.add(s);
    }

    public void AbrirArchivo() {
        File f = null;
        FileReader fr = null;
        BufferedReader br = null;
        try {
            JFileChooser jfc = new JFileChooser();
            FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos de Texto");
            jfc.setFileFilter(filtro);
            int selection = jfc.showOpenDialog(jfc);
            if (selection == JFileChooser.APPROVE_OPTION) {
                f = jfc.getSelectedFile();
                fr = new FileReader(f);
                br = new BufferedReader(fr);
                String linea;
                while ((linea = br.readLine()) != null) {

                }

            }
        } catch (Exception e) {
        }
    }
    

    public void Escribirarchivo() {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Seres_vivos s : sv) {
                bw.write(s.getRaza() + "|");
                bw.write(s.getKi() + "|");
                bw.write(s.getEdad()+ "|");
                bw.write(s.getPlaneta() + "|");

            }
        } catch (Exception e) {
        }
    }
    public void cargararchivo(){
        Scanner sc = null;
        Scanner sh = null;
        sv = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter("|");
                while (sc.hasNext()) {                    
                    sv.add(new Seres_vivos(sc.next(),sc.nextInt(), sc.nextInt(),sc.next()));
                }
            } catch (Exception e) {
            }
            sc.close();
        }
    }

}
