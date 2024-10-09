package com.sesi._8._0.view;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.sesi._8._0.model.Produto;

public class ProdutoView {
	    private JFrame frame;
	    private JTable table;
	    private DefaultTableModel tableModel;
	    
	    public ProdutoView() {
	        frame = new JFrame("Tabela de Produtos");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(600, 400);
	        
	        // Definindo colunas da tabela
	        String[] colunas = {"Nome", "Preço", "Estoque", "Editar", "Excluir"};
	        tableModel = new DefaultTableModel(colunas, 0);
	        table = new JTable(tableModel);
	        
	        // Adicionando botão de editar e excluir na tabela
	        table.getColumn("Editar").setCellRenderer(new ButtonRenderer());
	        table.getColumn("Excluir").setCellRenderer(new ButtonRenderer());
	        table.getColumn("Editar").setCellEditor(new ButtonEditor(new JCheckBox()));
	        table.getColumn("Excluir").setCellEditor(new ButtonEditor(new JCheckBox()));
	        
	        JScrollPane scrollPane = new JScrollPane(table);
	        frame.add(scrollPane);
	        
	        frame.setVisible(true);
	    }
	    
	    public void addProduto(Produto produto) {
	        Object[] row = {produto.getNome(), produto.getPreco(), produto.getEstoque(), "Editar", "Excluir"};
	        tableModel.addRow(row);
	    }
	}
