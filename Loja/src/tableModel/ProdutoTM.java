package tableModel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 * @author Gilberto Toledo
 */
public class ProdutoTM extends AbstractTableModel{

    private List<String[]> linhas;
    private String[] colunas = new String[]{"Id","Nome","Preço","Tipo","Qtd"};
    
    public  ProdutoTM() {
        linhas = new ArrayList<String[]>();
    }
    
    public ProdutoTM(List<String[]> lista) {
        linhas = new ArrayList<String[]>(lista);
    }
    
    @Override
    public int getColumnCount() {        
        return colunas.length;
    }
    
    @Override
    public int getRowCount() {
        return linhas.size();
    }
    
    @Override
    public String getColumnName(int columnIndex) {
        return colunas[columnIndex];
    }
    
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        String t[] = linhas.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return t[0];
            case 1:
                return t[1];
            case 2:
                return t[2];
            case 3:
                return t[3];
              case 4:
                return t[4];    
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }
    
    @Override
    //modifica na linha e coluna especificada
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        String t[] = linhas.get(rowIndex); // Carrega o item da linha que deve ser modificado

        switch (columnIndex) { // Seta o valor do campo respectivo
            case 0:
                t[0] = aValue.toString();
                break;
            case 1:
                t[1] = aValue.toString();
                break;
            case 2:
                t[2] = aValue.toString();
                break;
            case 3:
                t[3] = aValue.toString();
                break;    
            case 4:
                t[4] = aValue.toString();
            break;      
            default:
                // Isto não deveria acontecer...             
        }
        fireTableCellUpdated(rowIndex, columnIndex);
     }
    
    //modifica na linha especificada
    public void setValueAt(String aValue[], int rowIndex) {
        String t[] = linhas.get(rowIndex); // Carrega o item da linha que deve ser modificado
        
        t[0] = aValue[0];
        t[1] = aValue[1];
        t[2] = aValue[2];
        t[3] = aValue[3];
        t[4] = aValue[4];
        
        fireTableCellUpdated(rowIndex, 0);
        fireTableCellUpdated(rowIndex, 1);
        fireTableCellUpdated(rowIndex, 2);
        fireTableCellUpdated(rowIndex, 3);
        fireTableCellUpdated(rowIndex, 4);
    }
    
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
    
    public String[] getAluno(int indiceLinha) {
        return linhas.get(indiceLinha);
    }
    
    public void addAluno(String a[]) {
        // Adiciona o registro.
        linhas.add(a);
        int ultimoIndice = getRowCount() - 1;
        fireTableRowsInserted(ultimoIndice, ultimoIndice);
    }
    
     /* Remove a linha especificada. */
    public void remove(int indiceLinha) {
        linhas.remove(indiceLinha);
        fireTableRowsDeleted(indiceLinha, indiceLinha);
    }

    /* Adiciona uma lista de Cliente ao final dos registros. */
    public void addLista(List<String[]> a) {
        // Pega o tamanho antigo da tabela.
        int tamanhoAntigo = getRowCount();

        // Adiciona os registros.
        linhas.addAll(a);
        fireTableRowsInserted(tamanhoAntigo, getRowCount() - 1);
    }

    /* Remove todos os registros. */
    public void limpar() {
        linhas.clear();
        fireTableDataChanged();
    }

    /* Verifica se este table model esta vazio. */
    public boolean isEmpty() {
        return linhas.isEmpty();
    }   
}