package quotes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class QuoteService {

    private final static List<Quote> FRASES_PELICULAS = Arrays.asList(
            new Quote("Starwars", "Yo soy tu padre"),
            new Quote("Forest Gump", "Mi mamá siempre me decía que la vida era como una caja de bombones: nunca sabes lo que te va a tocar"),
            new Quote("El padrino", "Le haré una oferta que no podrá rechazar"),
            new Quote("Toy story", "¡Hasta el infinito y más allá!"),
            new Quote("James Bond", "Mi nombre es Bond, James Bond"),
            new Quote("Forest Gump", "Tonto es el que hace tonterías"),
            new Quote("El Padrino II", "Mantén cerca a tus amigos, pero aún más cerca a tus enemigos"),
            new Quote("Terminator 2", "Hasta la vista, baby"),
            new Quote("El señor de los anillos", "Mi tesoro..."),
            new Quote("La vida es bella", "Buenos días, princesa"),
            new Quote("Apolo 13", "Houston, tenemos un problema"),
            new Quote("Lo que el viendo se llevó", "A Dios pongo por testigo de que jamás volveré a pasar hambre"),
            new Quote("La princesa prometida", "Hola, me llamo Iñigo Montoya, tú mataste a mi padre, prepárate a morir"),
            new Quote("El sexto sentido", "En ocasiones veo muertos"),
            new Quote("Starwars", "Hace mucho tiempo, en una galaxia muy, muy lejana..."),
            new Quote("Titanic", "¡Soy el rey del mundo!"),
            new Quote("Karate Kid", "Dar cera, pulir cera"),
            new Quote("Una noche en la ópera", "La parte contratante de la primera parte será considerada como la parte contratante de la primera parte"),
            new Quote("Casablanca", "Siempre nos quedará París"),
            new Quote("Blade Runner", "Yo he visto cosas que vosotros no creeríais"),
            new Quote("El Señor de los Anillos", "Un mago nunca llega tarde, ni pronto: llega exactamente cuando se lo propone"),
            new Quote("Casino", "Hay tres maneras de hacer las cosas: la correcta, la incorrecta y la mía"),
            new Quote("Casablanca", "Presiento que éste es el comienzo de una hermosa amistad"),
            new Quote("Matrix", "No existen preguntas sin respuesta, sólo preguntas mal formuladas"),
            new Quote("Lo que el viento se llevó", "Francamente, querida, me importa un bledo"),
            new Quote("El precio del poder", "Siempre digo la verdad, incluso cuando miento digo la verdad"),
            new Quote("El cabo del miedo", "Abogadoooo... ¿Estás ahí, abogado?"),
            new Quote("Blade Runner", "Todos esos momentos se perderán en el tiempo como lágrimas en la lluvia"),
            new Quote("Aterriza como puedas", "Elegí un mal día para dejar de fumar"),
            new Quote("Starwars", "Ayúdame, Obi-Wan Kenobi... eres mi única esperanza"),
            new Quote("Apocalypse now", "Me encanta el olor a napalm por la mañana"),
            new Quote("Los inmortales", "Sólo puede quedar uno"),
            new Quote("Delitos y faltas", "La última vez que estuve dentro de una mujer fue cuando visité la Estatua de la Libertad"),
            new Quote("El Mago de Oz", "Tengo el presentimiento de que ya no estamos en Kansas"),
            new Quote("El Graduado", "Señora Robinson, trata de seducirme... ¿no es así?"),
//            new Quote("El Resplandor", "No voy a hacerte daño Wendy, sólo voy a arrancarte tu jodida cabeza"),
            new Quote("Braveheart", "Nos podrán quitar la vida, pero jamás nos quitarán la ¡¡LIBERTAD...!!"),
//            new Quote("La Jungla de Cristal", "Yipi-kay-yei... hijo de puta"),
            new Quote("Starwars", "Que la fuerza te acompañe"),
            new Quote("El Show de Truman", "Buenos días... y por si no volvemos a vernos: buenos días, buenas tardes y buenas noches"),
            new Quote("V de Vendetta", "El pueblo no debería temer a sus gobernantes, son los gobernantes los que deberían de temer al pueblo.")
    );

    public static Quote randomQuote() {
        Collections.shuffle(FRASES_PELICULAS);

        return FRASES_PELICULAS.get(0);
    }
}
