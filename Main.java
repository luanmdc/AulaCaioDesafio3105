import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Hospital>hospitals = new ArrayList<>();
        Hospital hospital = new Hospital();
        hospital.setNome("Sao Luiz");
        hospital.setTipo("Publico");
        hospitals.add(hospital);

        hospital = new Hospital();
        hospital.setNome("Sao vicente");
        hospital.setTipo("Publico");
        hospitals.add(hospital);

        hospital = new Hospital();
        hospital.setNome("Campo Limpo Pta");
        hospital.setTipo("Publico");
        hospitals.add(hospital);

        hospital = new Hospital();
        hospital.setNome("Notre dame");
        hospital.setTipo("Privado");
        hospitals.add(hospital);

        Metodos metodos = new Metodos();
        metodos.contaHospitais(hospitals);

        List<Playlist>musicas = new ArrayList<>();
        Playlist playlist = new Playlist();
        playlist.setNome("musica a");
        playlist.setEstilo("jazz");
        playlist.setDuracao(5);
        musicas.add(playlist);

        playlist = new Playlist();
        playlist.setNome("musica b");
        playlist.setEstilo("pop");
        playlist.setDuracao(4);
        musicas.add(playlist);

        playlist = new Playlist();
        playlist.setNome("musica c");
        playlist.setEstilo("country");
        playlist.setDuracao(2);
        musicas.add(playlist);

        playlist = new Playlist();
        playlist.setNome("musica a");
        playlist.setEstilo("pagode");
        playlist.setDuracao(5);
        musicas.add(playlist);

        metodos.contaMusicas(musicas);


        List<Pokemon>pokemons = new ArrayList<>();
        Pokemon pokemon = new Pokemon();
        pokemon.setNome("Charmander");
        pokemon.setTipo("Fogo");
        pokemon.setClassificacao("lendario");
        pokemons.add(pokemon);

        pokemon = new Pokemon();
        pokemon.setNome("Bumbassauro");
        pokemon.setTipo("Mato");
        pokemon.setClassificacao("lendario");
        pokemons.add(pokemon);

        pokemon = new Pokemon();
        pokemon.setNome("Pikatchu");
        pokemon.setTipo("Terra");
        pokemon.setClassificacao("lendario");
        pokemons.add(pokemon);

        pokemon = new Pokemon();
        pokemon.setNome("Snorlax");
        pokemon.setTipo("Mato");
        pokemon.setClassificacao("lendario");
        pokemons.add(pokemon);

        pokemon = new Pokemon();
        pokemon.setNome("Miau");
        pokemon.setTipo("terra");
        pokemon.setClassificacao("lendario");
        pokemons.add(pokemon);

        metodos.contaPokemon(pokemons);

        List<Filme>filmes = new ArrayList<>();
        Filme filme = new Filme();
        filme.setNome("filme a");
        filme.setTipo("acao");
        filme.setViolento(true);
        filmes.add(filme);

        filme = new Filme();
        filme.setNome("filme a");
        filme.setTipo("terror");
        filme.setViolento(true);
        filmes.add(filme);

        filme = new Filme();
        filme.setNome("filme a");
        filme.setTipo("infantil");
        filme.setViolento(false);
        filmes.add(filme);

        filme = new Filme();
        filme.setNome("filme a");
        filme.setTipo("intantil");
        filme.setViolento(false);
        filmes.add(filme);

        filme = new Filme();
        filme.setNome("filme a");
        filme.setTipo("suspense");
        filme.setViolento(true);
        filmes.add(filme);

        metodos.contaFilme(filmes);





    }
}
