package projetaobcc20172.com.projetopetemfocofornecedor.cadastrofornecedortest;

import projetaobcc20172.com.projetopetemfocofornecedor.R;
import projetaobcc20172.com.projetopetemfocofornecedor.TestTools;
import projetaobcc20172.com.projetopetemfocofornecedor.activity.CadastroFornecedorActivity;

/**
 * Created by raul on 12/12/17.
 */

public class TestToolsCadFornecedor {


    protected static void selecionarPerfil(){
        TestTools.selecionarSpinner(R.id.servicoSpinner,"Autônomo");
        TestTools.clicarBotao(R.id.btnCadastrarFornecedor);
        TestTools.verificarMudancaActivity(CadastroFornecedorActivity.class.getName());
    }

    protected static void preencherEclicar(String nome, String email,String cpfCnpj,String telefone ,String senha, String senha2,String horarios) {
        TestTools.digitarCampo(R.id.etCadastroNomeFornecedor, nome);
        TestTools.digitarCampo(R.id.etCadastroEmailFornecedor, email);
        TestTools.digitarCampoComScroll(R.id.etCadastroTelefoneFornecedor, telefone);
        TestTools.digitarCampoComScroll(R.id.etCadastroCpfCnpjFornecedor, cpfCnpj);
        TestTools.selecionarItemSpinnerComScroll(R.id.servicoSpinner, horarios);
        TestTools.digitarCampoComScroll(R.id.etCadastroSenhaFornecedor, senha);
        TestTools.digitarCampoComScroll(R.id.etCadastroSenha2Fornecedor, senha2);
        TestTools.clicarBotaoComScroll(R.id.btnCadastrarFornecedor);
    }

}
