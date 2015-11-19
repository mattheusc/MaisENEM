/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MaisEnem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Matheus
 */
public class Arq_notEnem {
    
    	public void criarDiretorio() throws IOException {
		File diretorio = new File("C:\\Program Files\\+Enem");
                diretorio.mkdir();
                if(!diretorio.exists()){
                    diretorio.createNewFile();
                }
        }              		
	
     public void criarArquivo(String nome) throws IOException {
                criarDiretorio();
		File arquivo = new File("C:\\Program Files\\+Enem", nome + ".txt");
                FileWriter f = new FileWriter(arquivo);
		f.close();
                
        }
     
     public void escreverArquivo(String nome, String valor) throws IOException {
                criarDiretorio();
		File arquivo = new File("C:\\Program Files\\+Enem", nome + ".txt");
		FileWriter f = new FileWriter(arquivo);
		BufferedWriter bw = new BufferedWriter(f);
		bw.write(valor);
		bw.close();
		f.close();
	}
    public void editarArquivo(String nome, String valor) throws IOException {
                criarDiretorio();
		File arquivo = new File("C:\\Program Files\\+Enem", nome);
		FileWriter f = new FileWriter(arquivo);
		BufferedWriter bw = new BufferedWriter(f);
		bw.write(valor);
		bw.close();
		f.close();
	}
     
     public String listarArquivos() throws IOException {
                criarDiretorio();
		File diretorio = new File("C:\\Program Files\\+Enem");
		String[] listaArquivos = diretorio.list();
                String exibirArquivos = "";
		for (int i = 0; i < listaArquivos.length; i++) {
			exibirArquivos += listaArquivos[i] + "\n";
		}
                return exibirArquivos;                                 
       }  
     
     public String lerArquivo(String nome) throws IOException {
                criarDiretorio();
		File arquivo = new File("C:\\Program Files\\+Enem", nome);
		FileReader fr = new FileReader (arquivo); 
		BufferedReader br = new BufferedReader(fr); 
                
                String exibirleitura = "";
		
		while (br.ready() ) {
			String linha = br.readLine( );
			exibirleitura += linha;
		}

		br.close( );
		fr.close( );
                return exibirleitura;
	}
     
     public void deletarArquivo(String nome) throws IOException{
       criarDiretorio();
       File arquivo =  new File("C:\\Program Files\\+Enem", nome);
       arquivo.delete();
    }
}
