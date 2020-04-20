package abeltran.example.m8uf2p2;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.List;

public class MessageAdapter extends ArrayAdapter<Preguntas> {
    public MessageAdapter(Context context, int resource, List<Preguntas> objects) {
        super(context, resource, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = ((Activity) getContext()).getLayoutInflater().inflate(R.layout.item_message, parent, false);
        }

        TextView preguntaTextView = (TextView) convertView.findViewById(R.id.preguntaTextView);
        TextView authorTextView = (TextView) convertView.findViewById(R.id.nameTextView);
        RadioButton respuesta1TextView = (RadioButton) convertView.findViewById(R.id.respuesta1radioButton);
        RadioButton respuesta2TextView = (RadioButton) convertView.findViewById(R.id.respuesta2radioButton);
        RadioButton respuesta3TextView = (RadioButton) convertView.findViewById(R.id.respuesta3radioButton);
        RadioButton respuesta4TextView = (RadioButton) convertView.findViewById(R.id.respuesta4radioButton);

        Preguntas message = getItem(position);


        authorTextView.setText("Autor: "+message.getName());
        preguntaTextView.setText("Pregunta: "+message.getPregunta());
        Respuestas respuestas = message.getRespuesta();
        respuesta1TextView.setText("1 - "+respuestas.getRespuesta1());
        respuesta2TextView.setText("2 - "+respuestas.getRespuesta2());
        respuesta3TextView.setText("3 - "+respuestas.getRespuesta3());
        respuesta4TextView.setText("4 - "+respuestas.getRespuesta4());

        return convertView;
    }
}
