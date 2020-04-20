package abeltran.example.m8uf2p2;

public class Preguntas {

    private String pregunta;
    private Respuestas respuestas;
    private String name;

    public Preguntas() {
    }

    public Preguntas(String pregunta, Respuestas respuestas, String name) {
        this.pregunta = pregunta;
        this.respuestas = respuestas;
        this.name = name;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public Respuestas getRespuesta() {
        return respuestas;
    }

    public void setRespuesta(Respuestas respuesta) {
        this.respuestas = respuesta;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
