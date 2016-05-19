/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import controle.ListaProfessores;
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
import modelo.Pessoa;

/**
 *
 * @author Wellington
 */
public class ListaAlunos {
    
     int quantidadeRegistrosXML;
     String diretorio = "C:\\Users\\Wellington\\Documents\\FATEC\\Estrutura de Dados\\XMLs Projeto\\listaAlunos.xml";
     ArrayList<Pessoa> listaAluno = new ArrayList();
     XStream xstream = new XStream(new DomDriver()); 
            //renomear nome de uma classe: xstream.alias("Professor", Professor.class)
    int n;
    
        public void cadastraAluno(Pessoa professor)
        {
             listaAluno.add(professor);
             
        }
        
        
        public void removeProfessor(int i)
        {
            
                  listaAluno.remove(i);
                //listaProf.remove(professor);
          
        }
        
        
      
        //retorno de registro        
        public void avancar(int a)
        {
           System.out.println("Avançando para" +listaAluno.get(a));     
        }
        
        
        
         public void alterarInformacao(int i,Pessoa dadosObjeto)
        {
            
           listaAluno.set(i, dadosObjeto);
           
            
        }
      
        
        
        
        
        //Imprime todos os registro em memoria RAM
        
        public void imprimirLista()
        {
            n = listaAluno.size();    
            
            for(int i=0; i<n; i++)
            {
           
            System.out.println(listaAluno.get(i));
            }
        }
        
        
        
        //Retorna a quantidade de registros em memoria RAM
        public int quantidadeRegistros()
        
        {
            return(listaAluno.size());
        }

        
        
        
        
        
        
       
        
         public void salvaArquivoXML()//Armazena todos os dados do Objeto no arquivo XML
        {
            
            
            String xml = xstream.toXML(listaAluno);
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
                  
                  System.out.println("Pessoa " + pessoa.getNome());
                 
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
              ArrayList<Pessoa> listaAluno2 = (ArrayList) xstream.fromXML(input);
              input.close();
         
              for(Pessoa pessoa: listaAluno2)
              {
                listaAluno.add(pessoa);
                 
              }
              
              
         
         } catch (FileNotFoundException ex) {
             Logger.getLogger(ListaProfessores.class.getName()).log(Level.SEVERE, null, ex);
         } catch (IOException ex) {
             Logger.getLogger(ListaAlunos.class.getName()).log(Level.SEVERE, null, ex);
         }
            
            
            
        }
        
     
}
