import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Metodos {
    //- Crie um método que receba uma lista de Hospitais e classifique quantos são públicos e quantos são privados;
    public void contaHospitais(List<Hospital> hospitals) {
        int contador = 1;
        Map<String, Integer> quantidadeHospitais = new HashMap<>();
        for (Hospital hospital : hospitals) {
            if (!quantidadeHospitais.containsKey(hospital.getTipo())) {
                quantidadeHospitais.put(hospital.getTipo(), contador);
            } else {
                Integer valor = quantidadeHospitais.get(hospital.getTipo());
                quantidadeHospitais.replace(hospital.getTipo(), valor, valor + contador);
            }
        }
        System.out.println(quantidadeHospitais);
    }

    //- Crie um método que receba uma lista de Playlist e classifique as quantidades de música por estilo,
    // porém, só adicione músicas que tem mais de 3 minutos de duração;
    public void contaMusicas(List<Playlist> musicas) {
        int contador = 1;
        Map<String, Integer> quantidadeMusicas = new HashMap<>();
        for (Playlist musica : musicas) {
            if (musica.getDuracao() >= 3) {
                if (!quantidadeMusicas.containsKey(musica.getEstilo())) {
                    quantidadeMusicas.put(musica.getEstilo(), contador);
                } else {
                    Integer valor = quantidadeMusicas.get(musica.getEstilo());
                    quantidadeMusicas.replace(musica.getEstilo(), valor, valor + contador);
                }
            }
        }
        System.out.println(quantidadeMusicas);
    }

    //- Crie um método que receba uma lista de Pokemon e classifique quantos Pokemon por tipo foram recebidos,
    // porém, só adicione Pokemon que são lendários;
    public void contaPokemon(List<Pokemon> pokemons) {
        int contador = 1;
        Map<String, Integer> quantidadePokemon = new HashMap<>();
        for (Pokemon pokemon : pokemons) {
            if (pokemon.getClassificacao() == "lendario") {
                if (!quantidadePokemon.containsKey(pokemon.getTipo())) {
                    quantidadePokemon.put(pokemon.getTipo(), contador);
                } else {
                    Integer valor = quantidadePokemon.get(pokemon.getTipo());
                    quantidadePokemon.replace(pokemon.getTipo(), valor, valor + contador);
                }
            }
        }
        System.out.println(quantidadePokemon);
    }

    //- Crie um método que receba uma lista de Filmes, separe em listas distintas filmes para
    // maiores de 12 anos e filmes de classificação livre.
    public void contaFilme(List<Filme> filmes) {
        Map<String, Integer> quantidadeFilmes = new HashMap<>();
        for (Filme filme : filmes) {
            if (filme.getViolento() == false) {
                if (!quantidadeFilmes.containsKey("Livre")) {
                    quantidadeFilmes.put("Livre", 1);
                } else {
                    Integer quantidade = quantidadeFilmes.get("Livre");
                    quantidadeFilmes.replace("Livre", quantidade, quantidade + 1);
                }
            }
            if (!quantidadeFilmes.containsKey("Para maiores de 12 anos")) {
                quantidadeFilmes.put("Para maiores de 12 anos", 1);
            } else {
                Integer quantidade = quantidadeFilmes.get("Para maiores de 12 anos");
                quantidadeFilmes.replace("Para maiores de 12 anos", quantidade, quantidade + 1);
            }
        }
        System.out.println(quantidadeFilmes);
    }
}


