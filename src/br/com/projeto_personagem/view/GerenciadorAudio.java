package br.com.projeto_personagem.view;
import javax.sound.sampled.*;
import java.io.File;

public class GerenciadorAudio {
    private Clip clip;
    private boolean mutado = false;
    private long posicaoFrame; // Guarda onde a música parou

    public void tocarMusica(String caminho) {
        try {
            File arquivo = new File(caminho);
            AudioInputStream input = AudioSystem.getAudioInputStream(arquivo);
            clip = AudioSystem.getClip();
            clip.open(input);
            clip.loop(Clip.LOOP_CONTINUOUSLY); // Toca sem parar
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void alternarMudo() {
        if (clip == null) return;

        if (!mutado) {
            posicaoFrame = clip.getMicrosecondPosition();
            clip.stop();
            mutado = true;
        } else {
            clip.setMicrosecondPosition(posicaoFrame);
            clip.start();
            clip.loop(Clip.LOOP_CONTINUOUSLY);
            mutado = false;
        }
    }
}