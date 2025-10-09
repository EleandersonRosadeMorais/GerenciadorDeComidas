package com.ulbra.comidas;


import android.app.AlertDialog;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TelaListagemComidas {
    MainActivity act;
    TelaPrincipal tela_principal;
    Button btanterior, btproximo, btfechar;
    TextView txtnome, txtkcal, txtcarboidratos, txtproteinas, txtgorduras, txtstatus;
    int index;

    public TelaListagemComidas(MainActivity act, TelaPrincipal tela_principal) {
        this.act = act;
        this.tela_principal = tela_principal;
    }

    public void CarregarTela() {
        if (act.getRegistros().size() == 0) {
            new AlertDialog.Builder(act)
                    .setTitle("Aviso")
                    .setMessage("Não existe nenhum registro cadastrado.")
                    .setNeutralButton("OK", null)
                    .show();
            return;
        }
        index = 0;
        act.setContentView(R.layout.listagem_comidas_cadastradas);
        btanterior = act.findViewById(R.id.btanterior);
        btproximo = act.findViewById(R.id.btproximo);
        btfechar = act.findViewById(R.id.btfechar);
        txtnome = act.findViewById(R.id.txtnome);
        txtkcal = act.findViewById(R.id.txtkcal);
        txtcarboidratos = act.findViewById(R.id.txtcarboidratos);
        txtproteinas = act.findViewById(R.id.txtproteinas);
        txtgorduras = act.findViewById(R.id.txtgorduras);
        txtstatus = act.findViewById(R.id.txtstatus);
        PreencheCampos(index);
        AtualizaStatus(index);

        btanterior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (index > 0) {
                    index--;
                    PreencheCampos(index);
                    AtualizaStatus(index);
                }
            }
        });

        btproximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (index < act.getRegistros().size() - 1) {
                    index++;
                    PreencheCampos(index);
                    AtualizaStatus(index);
                }
            }
        });

        btfechar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tela_principal.CarregarTela();
            }
        });
    }

    private void PreencheCampos(int idx) {
        Registro registro = act.getRegistros().get(idx);
        txtnome.setText("Nome: " + registro.getNome());
        txtkcal.setText("Kcal: " + registro.getKcal());
        txtcarboidratos.setText("Carboidratos: " + registro.getCarboidratos());
        txtproteinas.setText("Proteínas: " + registro.getProteinas());
        txtgorduras.setText("Gorduras: " + registro.getGorduras());
    }

    private void AtualizaStatus(int idx) {
        int total = act.getRegistros().size();
        txtstatus.setText("Registros: " + (idx + 1) + "/" + total);
    }
}
