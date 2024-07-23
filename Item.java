import java.util.Date;
import java.text.SimpleDateFormat;
import com.j256.ormlite.table.DatabaseTable;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.DataType;

@DatabaseTable(tableName = "Item")
public class Item
{   
    @DatabaseField(generatedId = true)
    private int id;
    
    @DatabaseField
    private String Nome;
    
    @DatabaseField
    public int Quantidade;
    
    @DatabaseField
    public double Preco;
    
    @DatabaseField(dataType=DataType.DATE)
    public Date DataAtualizacao;    
    
    public String printData() {
        SimpleDateFormat dateFor = new SimpleDateFormat("dd/MM/yyyy");
        return dateFor.format(DataAtualizacao);
    }

//Start GetterSetterExtension Source Code

    /**GET Method Propertie id*/
    public int getId(){
        return this.id;
    }//end method getId

    /**SET Method Propertie id*/
    public void setId(int id){
        this.id = id;
    }//end method setId

    /**GET Method Propertie nome*/
    public String getNome(){
        return this.Nome;
    }//end method getNome

    /**SET Method Propertie nome*/
    public void setNome(String Nome){
        this.Nome = Nome;
    }//end method setNome

    /**GET Method Propertie quantidade*/
    public int getQuantidade(){
        return this.Quantidade;
    }//end method getQuantidade

    /**SET Method Propertie quantidade*/
    public void setQuantidade(int Quantidade){
        this.Quantidade = Quantidade;
    }//end method setQuantidade
    
    /**GET Method Propertie preco*/
    public double getPreco(){
        return this.Preco;
    }//end method getPreco

    /**SET Method Propertie preco*/
    public void setPreco(int Preco){
        this.Preco = Preco; 
    }//end method setPreco

    /**GET Method Propertie data*/
    public Date getData(){
        return this.DataAtualizacao;
    }//end method getData

    /**SET Method Propertie data*/
    public void setData(Date DataAtualizacao){
        this.DataAtualizacao = DataAtualizacao;
    }//end method setData

//End GetterSetterExtension Source Code


}//End class