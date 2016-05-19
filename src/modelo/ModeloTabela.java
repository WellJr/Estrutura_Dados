/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Wellington
 */
public class ModeloTabela extends AbstractTableModel {
    
    private ArrayList linhas = null;
    private String[] colunas = null;
    
    
    public ModeloTabela()
    {
        
    }
    
    public ModeloTabela(ArrayList lin, String[] col)//Metodo para determinar a quantidade de linhas e colunas
    {
        
      setLinhas(lin);
      setColunas(col);
        
    }
    
    public ArrayList getLinhas()
    {
      return linhas;   
    }

    public void setLinhas(ArrayList dados)
    {
       linhas=dados; 
    }
    
    public String[] getColunas()
    {
      return colunas;  
    }
    
    public void setColunas(String[] nomes)
    {
      colunas = nomes;  
    }
    
    public int getColumnCount()
    {
        return colunas.length; //Retorna a quantidade de caracteres que vai ter no nome da coluna
    }
    
    public int getRowCount()
    {
        return linhas.size(); //Conta o tamano da Array (quantos elementos tem dentroa da Array)
    }
    
    public String getColumnName(int numCol)//Retorna a quantidade de colunas que foram passadas (nomes)
    {
        return colunas[numCol];
    }
    
    public Object getValueAt(int numLin, int numCol)
    {
     Object[] linha   = (Object[]) getLinhas().get(numLin);
     return linha[numCol];
    }
    
}
