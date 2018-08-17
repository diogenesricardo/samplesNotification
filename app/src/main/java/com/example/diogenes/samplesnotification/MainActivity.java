package com.example.diogenes.samplesnotification;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickNotificacaoSimples(View view) {
        int id = 1;
        Intent intent = new Intent(this,ScreenCalledByNotificationActivity.class);
        intent.putExtra("msg","Olá Alunos, como vão?");
        String contentTitle = "Atualização de saldo";
        String contentText = "Chegaram novos bitcoin em sua conta";
        NotificationUtil.criarNotificacaoSimples(this,intent,contentTitle,contentText,id);
    }


    public void onClickNotificacaoGrande(View view) {
        int id = 2;
        Intent intent = new Intent(this,ScreenCalledByNotificationActivity.class);
        intent.putExtra("msg","Olá investidor, como vai?");
        List<String> list = new ArrayList<>();
        list.add("BTC - 30.000");
        list.add("ETH - 10.000");
        list.add("LTC - 20.000");
        String contentTitle = "Saldo da carteira";
        String contentText = String.format("Você possui %s novos valores",list.size());
        NotificationUtil.criarNotificacaoGrande(this, intent, contentTitle, contentText, list, id);
    }
}
