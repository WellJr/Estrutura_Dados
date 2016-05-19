/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.util.ArrayList;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Instituicao;
import modelo.Pessoa;
/**
 *
 * @author Wellington
 */
public class ListaInstituicao {
    
   ArrayList<Instituicao> listaInstituicao = new ArrayList();
    XStream xstream = new XStream(new DomDriver());
    int i;
    String diretorio = "C:\\Users\\Wellington\\Documents\\FATEC\\Estrutura de Dados\\XMLs Projeto\\listaInstituicoes.xml";
    int quantidadeRegistrosXML;
    public void cadastraInstituicao(Instituicao instituicao)
    {
        
        listaInstituicao.add(instituicao);
        
        
    }
    
    public void imprimirNomes()
    {
        
        int n = listaInstituicao.size();
        
        for ( i = 0; i<n; i++)
        {
            
            System.out.println(listaInstituicao.get(i).getNome());
        }
        
    }
    
    
//Retorna a quantidade de registros em memoria RAM
        public int quantidadeRegistros()
        
        {
            return(listaInstituicao.size());
        }

        
        
        public void removeInstituicao(int i)
        {
                 
                  listaInstituicao.remove(i);
                //listaProf.remove(professor);
          
        }
        
        
         public void alterarInformacao(int i,Instituicao dadosObjeto)
        {
            
           listaInstituicao.set(i, dadosObjeto);
           
            
        }
      
        
        
        //selecionar diretorio onde sera salvo o xml
        /*public void setDiretorio()
        {
          
          diretorio = "C:\\Users\\Wellington\\Documents\\FATEC\\Estrutura de Dados\\XMLs Projeto\\listaProfessores.xml";
          
        }*/
        
      
      
      
        public void SalvaArquivoXML()//Armazena todos os dados do Objeto no arquivo XML
        {
            
            
            String xml = xstream.toXML(listaInstituicao);
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
              xstream.alias("instituicao", ArrayList.class);
              xstream.processAnnotations(Pessoa.class);
              
              BufferedReader input = new BufferedReader(new FileReader(diretorio));
              ArrayList<Instituicao> listaInst2 = (ArrayList) xstream.fromXML(input);
              input.close();
         
              for(Instituicao instituicao: listaInst2)
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
              xstream.alias("instituicao", ArrayList.class);
              xstream.processAnnotations(Pessoa.class);
              
              BufferedReader input = new BufferedReader(new FileReader(diretorio));
              ArrayList<Instituicao> listaInst2 = (ArrayList) xstream.fromXML(input);
              input.close();
         
            quantidadeRegistrosXML = listaInst2.size();
          
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
              xstream.alias("instituicao", ArrayList.class);
              xstream.processAnnotations(Instituicao.class);
              
              BufferedReader input = new BufferedReader(new FileReader(diretorio));
              ArrayList<Instituicao> listaInst2 = (ArrayList) xstream.fromXML(input);
              input.close();
         
              for(Instituicao instituicao: listaInst2)
              {
                  
                   //teste = pessoa.getNome();
                   //teste1 = pessoa.getRG();
                   //System.out.println(teste);
                   //System.out.println(teste1);
                   listaInstituicao.add(instituicao);
                   
              }
              
              
         
         } catch (FileNotFoundException ex) {
             Logger.getLogger(ListaProfessores.class.getName()).log(Level.SEVERE, null, ex);
         } catch (IOException ex) {
             Logger.getLogger(ListaProfessores.class.getName()).log(Level.SEVERE, null, ex);
         }
            
            
            
        }
        




}
