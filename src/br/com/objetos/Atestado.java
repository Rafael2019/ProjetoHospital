

package br.com.objetos;

import java.util.Date;


public class Atestado {
    
    private Date datainicioDoAtestado, dataFimDoAtestado;
    private Consulta consulta;
    private int quantidadeDias;

    public Atestado(Date datainicioDoAtestado, Date dataFimDoAtestado, Consulta consulta, int quantidadeDias) {
        this.datainicioDoAtestado = datainicioDoAtestado;
        this.dataFimDoAtestado = dataFimDoAtestado;
        this.consulta = consulta;
        this.quantidadeDias = quantidadeDias;
    }

    public Date getDatainicioDoAtestado() {
        return datainicioDoAtestado;
    }

    public void setDatainicioDoAtestado(Date datainicioDoAtestado) {
        this.datainicioDoAtestado = datainicioDoAtestado;
    }

    public Date getDataFimDoAtestado() {
        return dataFimDoAtestado;
    }

    public void setDataFimDoAtestado(Date dataFimDoAtestado) {
        this.dataFimDoAtestado = dataFimDoAtestado;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

    public int getQuantidadeDias() {
        return quantidadeDias;
    }

    public void setQuantidadeDias(int quantidadeDias) {
        this.quantidadeDias = quantidadeDias;
    }

    @Override
    public String toString() {
        return "Atestado{" + "datainicioDoAtestado=" + datainicioDoAtestado + ", dataFimDoAtestado=" + dataFimDoAtestado + ", consulta=" + consulta + ", quantidadeDias=" + quantidadeDias + '}';
    }
    
}
