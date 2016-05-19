/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Pessoa;
import visao.CadProfessor;
public class ListaProfessores{
     int n;
     int m;
     int quantidadeRegistrosXML;
     private Object devolveValor;
     private String diretorio = "C:\\Users\\Wellington\\Documents\\FATEC\\Estrutura de Dados\\XMLs Projeto\\listaProfessores.xml";
     
     
     
     
    ArrayList<Pessoa> listaProf = new ArrayList();
   
    XStream xstream = new XStream(new DomDriver()); 
            //renomear nome de uma classe: xstream.alias("Professor", Professor.class)
    
    
        public void cadastraProfessor(Pessoa dadosProfessor)
        {
             listaProf.add(dadosProfessor);
            
             
        }
        
        
        
        
        
        
        public void removeProfessor(int i)
        {
                 
                  listaProf.remove(i);
                //listaProf.remove(professor);
          
        }
        
        public void alterarInformacao(int i,Pessoa dadosObjeto)
        {
            
           listaProf.set(i, dadosObjeto);
           
            
        }
      
       
        




        //retorno de registro        
        public void avancar(int a)
        {
           System.out.println("Avançando para" +listaProf.get(a));     
        }
        
        
        //Imprime todos os registro em memoria RAM
        
        public void imprimirLista()
        {
            n = listaProf.size();    
            
            for(int i=0; i<n; i++)
            {
           
            System.out.println("Imprimindo"+ listaProf.get(i));
            }
        }
        
        
        
        //Retorna a quantidade de registros em memoria RAM
        public int quantidadeRegistros()
        
        {
            return(listaProf.size());
        }

        
        
        
        
        
        //selecionar diretorio onde sera salvo o xml
        /*public void setDiretorio()
        {
          
          diretorio = "C:\\Users\\Wellington\\Documents\\FATEC\\Estrutura de Dados\\XMLs Projeto\\listaProfessores.xml";
          
        }*/
        
      
      
      
        public void SalvaArquivoXML()//Armazena todos os dados do Objeto no arquivo XML
        {
            
            
            String xml = xstream.toXML(listaProf);
            System.out.println(xml);
            
            //geraArquivoXML(xml); 
            
            
            
            PrintWriter print = null;  
            
         try {
             File file = new File(diretorio);
             print = new PrintWriter(file);
             
           
             
             print.write(xml);
             print.flush();
             print.close();
            
         } catch (FileNotFoundException ex) {
             
             Logger.getLogger(ListaProfessores.class.getName()).log(Level.SEVERE, null, ex);
         }
        
        
        }
        
        
        
        public void buscaArquivoXML() throws IOException //Metodo para buscar todos os dados do arquivo XML
        {
            String teste,teste1;
         try {
             FileReader ler = new FileReader(diretorio);
              XStream xstream = new XStream(new DomDriver());
              xstream.alias("pessoa", ArrayList.class);
              xstream.processAnnotations(Pessoa.class);
              
              BufferedReader input = new BufferedReader(new FileReader(diretorio));
              ArrayList<Pessoa> listaProf2 = (ArrayList) xstream.fromXML(input);
              input.close();
         
              for(Pessoa pessoa: listaProf2)
              {
                  
                   //teste = pessoa.getNome();
                   //teste1 = pessoa.getRG();
                   //System.out.println(teste);
                   //System.out.println(teste1);
                  // listaProf.add(pessoa);
                   
              }
              
              
         
         } catch (FileNotFoundException ex) {
             Logger.getLogger(ListaProfessores.class.getName()).log(Level.SEVERE, null, ex);
         }
            
        }
        
        
        
        public int quantidadeRegistrosXML()
        {
           try {
             FileReader ler = new FileReader(diretorio);
              XStream xstream = new XStream(new DomDriver());
              xstream.alias("pessoa", ArrayList.class);
              xstream.processAnnotations(Pessoa.class);
              
              BufferedReader input = new BufferedReader(new FileReader(diretorio));
              ArrayList<Pessoa> listaProf2 = (ArrayList) xstream.fromXML(input);
              input.close();
         
            quantidadeRegistrosXML = listaProf2.size();
          
         } catch (FileNotFoundException ex) {
             Logger.getLogger(ListaProfessores.class.getName()).log(Level.SEVERE, null, ex);
         } catch (IOException ex) {
             Logger.getLogger(ListaProfessores.class.getName()).log(Level.SEVERE, null, ex);
         }
         
            return quantidadeRegistrosXML;
         
        }
        
        
        public void recuperaDados()
        {
            
            try {
             FileReader ler = new FileReader(diretorio);
              XStream xstream = new XStream(new DomDriver());
              xstream.alias("pessoa", ArrayList.class);
              xstream.processAnnotations(Pessoa.class);
              
              BufferedReader input = new BufferedReader(new FileReader(diretorio));
              ArrayList<Pessoa> listaProf2 = (ArrayList) xstream.fromXML(input);
              input.close();
         
              for(Pessoa pessoa: listaProf2)
              {
                  
                   //teste = pessoa.getNome();
                   //teste1 = pessoa.getRG();
                   //System.out.println(teste);
                   //System.out.println(teste1);
                   listaProf.add(pessoa);
                   
              }
              
              
         
         } catch (FileNotFoundException ex) {
             Logger.getLogger(ListaProfessores.class.getName()).log(Level.SEVERE, null, ex);
         } catch (IOException ex) {
             Logger.getLogger(ListaProfessores.class.getName()).log(Level.SEVERE, null, ex);
         }
            
            
            
        }
        
        
        
        
        
        
        
        
        

}
