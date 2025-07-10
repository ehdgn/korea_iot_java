package org.example.test0710.자바OOP구현문제;

interface Playable {
    void play();
}

class Piano implements Playable {
    @Override
    public void play() {
        System.out.println("피아노 소리");
    }
}

class Guitar implements Playable {
    @Override
    public void play() {
        System.out.println("기타 소리");
    }
}

public class Q4 {
    public static void main(String[] args) {
        Playable piano = new Piano();
        Playable guitar = new Guitar();

        if(piano instanceof Piano) {
            Piano playPiano = (Piano) piano;
            playPiano.play();
        }

        if(guitar instanceof Guitar) {
            Guitar playGuitar = (Guitar) guitar;
            playGuitar.play();
        }
    }
}
