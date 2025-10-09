package com.ulbra.comidas;


import android.view.View;
import android.widget.Button;


public class TelaPrincipal {
    MainActivity act;
    Button btcadastrar_comida; // Alterado para cadastrar comida
    Button bt_listar_comidas_cadastradas; // Alterado para listar comidas cadastradas
    TelaCadastroComida tela_cadastro; // Alterado para TelaCadastroComida
    TelaListagemComidas tela_listagem; // Alterado para TelaListagemComidas

    public TelaPrincipal(MainActivity act) {
        this.act = act;
    }

    public void CarregarTela() {
        act.setContentView(R.layout.tela_principal); // Mantém a referência de layout
        btcadastrar_comida = act.findViewById(R.id.btcadastrar_comida); // Alterado para cadastrar comida
        bt_listar_comidas_cadastradas = act.findViewById(R.id.bt_listar_comidas_cadastradas); // Alterado para listar comidas cadastradas

        btcadastrar_comida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Chama o método para carregar a tela de cadastro
                tela_cadastro.CarregarTela();
            }
        });

        bt_listar_comidas_cadastradas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Chama o método para listar as comidas cadastradas
                tela_listagem.CarregarTela();
            }
        });
    }

    public void setTelaCadastro(TelaCadastroComida tela_cadastro) { // Alterado para TelaCadastroComida
        this.tela_cadastro = tela_cadastro;
    }

    public void setTelaListagem(TelaListagemComidas tela_listagem) { // Alterado para TelaListagemComidas
        this.tela_listagem = tela_listagem;
    }
}
