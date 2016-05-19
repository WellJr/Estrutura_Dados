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
import modelo.Curso;
import modelo.Pessoa;

/**
 *
 * @author Wellington
 */
public class ListaCurso {
    
String diretorio = "C:\\Users\\Wellington\\Documents\\FATEC\\Estrutura de Dados\\XMLs Projeto\\listaCursos.xml";
int n;

ArrayList<Curso> listaCurso = new ArrayList();
 XStream xstream = new XStream(new DomDriver()); 


 public void cadastraCurso(Curso curso)
        {
             listaCurso.add(curso);
             
        }
        
        
        public void removeCurso(int i)
        {
            
                  listaCurso.remove(i);
                //listaProf.remove(professor);
          
        }
        
        
      
        //retorno de registro        
        public void avancar(int a)
        {
           System.out.println("Avançando para" +listaCurso.get(a));     
        }
        
        
        
         public void alterarInformacao(int i,Curso dadosObjeto)
        {
            
           listaCurso.set(i, dadosObjeto);
           
            
        }
      
        
        
        
        
        //Imprime todos os registro em memoria RAM
        
        public void imprimirLista()
        {
            n = listaCurso.size();    
            
            for(int i=0; i<n; i++)
            {
           
            System.out.println(listaCurso.get(i));
            }
        }
        
        
        
        //Retorna a quantidade de registros em memoria RAM
        public int quantidadeRegistros()
        
        {
            return(listaCurso.size());
        }

        
        
        
        
        
        
       
        
         public void salvaArquivoXML()//Armazena todos os dados do Objeto no arquivo XML
        {
            
            
            String xml = xstream.toXML(listaCurso);
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
              xstream.alias("curso", ArrayList.class);
              xstream.processAnnotations(Pessoa.class);
              
              BufferedReader input = new BufferedReader(new FileReader(diretorio));
              ArrayList<Pessoa> listaCurso2 = (ArrayList) xstream.fromXML(input);
              input.close();
         
              for(Pessoa pessoa: listaCurso2)
              {
                  
                  System.out.println("Curso " + pessoa.getNome());
                 
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
              xstream.alias("curso", ArrayList.class);
              xstream.processAnnotations(Pessoa.class);
              
              BufferedReader input = new BufferedReader(new FileReader(diretorio));
              ArrayList<Curso> listaCurso2 = (ArrayList) xstream.fromXML(input);
              input.close();
         
            //quantidadeRegistrosXML = listaProf2.size();
          
         } catch (FileNotFoundException ex) {
             Logger.getLogger(ListaProfessores.class.getName()).log(Level.SEVERE, null, ex);
         } catch (IOException ex) {
             Logger.getLogger(ListaProfessores.class.getName()).log(Level.SEVERE, null, ex);
         }
         
            return 0; //quantidadeRegistrosXML;
         
        }
       
        
        
        public void recuperaDados()
        {
            
             
            
            try {
             FileReader ler = new FileReader(diretorio);
              XStream xstream = new XStream(new DomDriver());
              xstream.alias("curso", ArrayList.class);
              xstream.processAnnotations(Pessoa.class);
              
              BufferedReader input = new BufferedReader(new FileReader(diretorio));
              ArrayList<Curso> listaCurso2 = (ArrayList) xstream.fromXML(input);
              input.close();
         
              for(Curso curso: listaCurso2)
              {
                listaCurso.add(curso);
                 
              }
              
              
         
         } catch (FileNotFoundException ex) {
             Logger.getLogger(ListaProfessores.class.getName()).log(Level.SEVERE, null, ex);
         } catch (IOException ex) {
             Logger.getLogger(ListaAlunos.class.getName()).log(Level.SEVERE, null, ex);
         }
            
            
            
        }
        
     
}

