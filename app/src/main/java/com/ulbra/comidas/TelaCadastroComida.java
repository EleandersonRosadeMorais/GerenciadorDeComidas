package com.ulbra.comidas;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class TelaCadastroComida {
    MainActivity act;
    EditText ednome, edkcal, edcarboidratos, edproteinas, edgorduras;
    Button btcadastrar, btcancelar_cadastro;
    TelaPrincipal tela_principal;

    public TelaCadastroComida(MainActivity act, TelaPrincipal tela_principal) {
        this.act = act;
        this.tela_principal = tela_principal;
    }

    public void CarregarTela() {
        act.setContentView(R.layout.cadastro_de_comidas);
        ednome = act.findViewById(R.id.ednome);
        edkcal = act.findViewById(R.id.edkcal);
        edcarboidratos = act.findViewById(R.id.edcarboidratos);
        edproteinas = act.findViewById(R.id.edproteinas);
        edgorduras = act.findViewById(R.id.edgorduras);
        btcadastrar = act.findViewById(R.id.btcadastrar);
        btcancelar_cadastro = act.findViewById(R.id.btcancelar_cadastro);

        btcadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder dialogo = new AlertDialog.Builder(act);
                dialogo.setTitle("Aviso");
                dialogo.setMessage("Cadastrar comida?");
                dialogo.setNegativeButton("Não", null);
                dialogo.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String nome = ednome.getText().toString();
                        String kcal = edkcal.getText().toString();
                        String carboidratos = edcarboidratos.getText().toString();
                        String proteinas = edproteinas.getText().toString();
                        String gorduras = edgorduras.getText().toString();

                        act.getRegistros().add(new Registro(nome, kcal, carboidratos, proteinas, gorduras));
                        act.ExibirMensagem("Cadastro efetuado com sucesso.");
                        tela_principal.CarregarTela();
                    }
                });
                dialogo.show();
            }
        });

        btcancelar_cadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder dialogo = new AlertDialog.Builder(act);
                dialogo.setTitle("Aviso");
                dialogo.setMessage("Sair do cadastro?");
                dialogo.setNegativeButton("Não", null);
                dialogo.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        tela_principal.CarregarTela();
                    }
                });
                dialogo.show();
            }
        });
    }
}
