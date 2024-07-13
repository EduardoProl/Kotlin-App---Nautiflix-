package com.example.nautiflix.model

import androidx.lifecycle.ViewModel
import com.example.nautiflix.R
import com.example.nautiflix.model.Filme

class catalogo : ViewModel(){
    val filmesDrama = arrayOf(
        Filme(
            url="https://firebasestorage.googleapis.com/v0/b/nautiflix-e49ec.appspot.com/o/Drama%2FGone%20with%20the%20Wind%20(1939)%20Official%20Trailer%20-%20Clark%20Gable%2C%20Vivien%20Leigh%20Movie%20HD.mp4?alt=media&token=0953d80c-bc28-44a7-bea6-e0f4b7924b93",
            titulo = "Gone With the Wind",
            capa = R.drawable.gonewiththewind,
            poster = R.drawable.gonewiththewind_card,
            sinopse = "Em meio à Guerra Civil Americana, Scarlett O'Hara, a bela e voluntariosa filha de um fazendeiro, enfrenta dificuldades pessoais e sociais enquanto luta para manter a fazenda da família. O filme explora temas de amor, perda e sobrevivência, destacando o relacionamento turbulento de Scarlett com Rhett Butler.",
            categorias = arrayOf(1,0,0,0,0,0,0,0,0,0) , // Id da categoria Drama
            categoriasSTR = "Drama, Romance, Guerra"
        ),
        Filme(
            url = "https://firebasestorage.googleapis.com/v0/b/nautiflix-e49ec.appspot.com/o/Drama%2FTHE%20GODFATHER%20%EF%BD%9C%2050th%20Anniversary%20Trailer%20%EF%BD%9C%20Paramount%20Pictures.mp4?alt=media&token=ad485c37-700b-4bf3-95f9-be5a33aad579",
            titulo = "The Godfather",
            capa = R.drawable.thegodfather_cover,
            poster = R.drawable.thegodfather_card,
            sinopse = "A saga épica da família Corleone, uma das mais poderosas famílias mafiosas dos Estados Unidos. Liderada pelo patriarca Vito Corleone, a história acompanha a ascensão de seu filho Michael ao poder, revelando os dilemas morais e a brutalidade do mundo do crime organizado.",
            categorias = arrayOf(1,0,0,0,0,0,0,0,0,0),
            categoriasSTR = "Drama, Crime, Ficção Policial"
        ),
        Filme(
            url = "https://firebasestorage.googleapis.com/v0/b/nautiflix-e49ec.appspot.com/o/Drama%2FThe%20Godfather%20Part%20II%20Trailer%20(HD).mp4?alt=media&token=4bd2a5a4-d264-4ea7-9cc5-958f7b262f7c",
            titulo = "The Godfather, Part II",
            capa = R.drawable.thegodfatherii_cover,
            poster = R.drawable.thegodfatherii_card,
            sinopse = "Alternando entre o passado e o presente, o filme segue a vida de Vito Corleone desde a infância na Sicília até sua chegada à América e ascensão no mundo do crime. Paralelamente, mostra a consolidação de Michael Corleone como líder da família e as suas tentativas de expandir e legitimar os negócios da família.",
            categorias = arrayOf(1,0,0,0,0,0,0,0,0,0),
            categoriasSTR = "Drama, Crime"
        ),
        Filme(
            url = "https://firebasestorage.googleapis.com/v0/b/nautiflix-e49ec.appspot.com/o/Drama%2FCasablanca%20%EF%BD%9C%204K%20Trailer%20%EF%BD%9C%20Warner%20Bros.%20Entertainment.mp4?alt=media&token=827651b9-113d-4e16-a446-8e467bc76b91",
            titulo = "Casablanca",
            capa = R.drawable.basablanca_cover,
            poster = R.drawable.casblanca_card,
            sinopse = "Durante a Segunda Guerra Mundial, o expatriado americano Rick Blaine é dono de um famoso café em Casablanca. Sua vida é virada de cabeça para baixo quando sua antiga amante Ilsa entra no seu café com o marido, um líder da resistência. Rick enfrenta um dilema entre ajudar o casal a fugir dos nazistas ou manter seus sentimentos pessoais.",
            categorias = arrayOf(1,0,0,0,0,0,0,0,0,0),
            categoriasSTR = "Drama, Romance, Guerra"
        )
    )

    val filmesAcao = arrayOf(
        Filme(
            url = "https://firebasestorage.googleapis.com/v0/b/nautiflix-e49ec.appspot.com/o/Action%2FThe%20Terminator%20(1984)%20Official%20Trailer%20-%20Arnold%20Schwarzenegge%20Movie.mp4?alt=media&token=347c2bd1-747b-4ab1-aabf-b855e98be82e",
            titulo = "The Terminator",
            capa = R.drawable.theterminator_cover,
            poster = R.drawable.theterminator_card,
            sinopse = "Um cyborg assassino é enviado do futuro para matar Sarah Connor, cuja vida está destinada a ter um impacto crucial na resistência humana contra as máquinas. Sarah, com a ajuda de um soldado humano enviado para protegê-la, deve escapar e sobreviver.",
            categorias = arrayOf(0,1,0,0,0,0,0,0,0,0),
            categoriasSTR = "Ação, Sci-Fi"
        ),
        Filme(
            url = "https://firebasestorage.googleapis.com/v0/b/nautiflix-e49ec.appspot.com/o/Action%2FThe%20Dark%20Knight%20(2008)%20Official%20Trailer%20%231%20-%20Christopher%20Nolan%20Movie%20HD.mp4?alt=media&token=820e920c-1444-4ee6-b25a-eadac20735dd",
            titulo = "The Dark Knight",
            capa = R.drawable.thedarkknight_cover,
            poster = R.drawable.thedarkknight_card,
            sinopse = "Batman enfrenta seu maior desafio quando o misterioso e sádico Coringa emerge como uma nova ameaça em Gotham City. O filme explora temas de moralidade e justiça enquanto Bruce Wayne luta para proteger a cidade e aqueles que ama.",
            categorias = arrayOf(0,1,0,0,0,0,0,0,0,0),
            categoriasSTR = "Ação, Crime"
        ),
        Filme(
            url="https://firebasestorage.googleapis.com/v0/b/nautiflix-e49ec.appspot.com/o/Action%2FThe%20Matrix%20-%20Original%20Theatrical%20Trailer.mp4?alt=media&token=5147d864-fb7c-4dd1-9a45-fb0405f79011",
            titulo = "The Matrix",
            capa = R.drawable.thematrix_cover,
            poster = R.drawable.thematrix_card,
            sinopse = "Thomas Anderson, um programador de computadores, descobre que a realidade que ele conhece é uma simulação virtual criada por máquinas para controlar a humanidade. Com a ajuda de Morpheus e Trinity, ele embarca em uma jornada para libertar a mente das pessoas e confrontar as máquinas opressoras.",
            categorias = arrayOf(0,1,0,0,0,0,0,0,0,0),
            categoriasSTR = "Ação, Sci-Fi"
        ),
        Filme(
            url="https://firebasestorage.googleapis.com/v0/b/nautiflix-e49ec.appspot.com/o/Action%2FDie%20Hard%20%EF%BD%9C%2030th%20Anniversary%20Trailer%20%EF%BD%9C%2020th%20Century%20FOX.mp4?alt=media&token=13f2bbf0-f527-403c-8394-c558ef7df4e3",
            titulo = "Die Hard",
            capa = R.drawable.diehard_cover,
            poster = R.drawable.diehard_card,
            sinopse = "O policial de Nova York, John McClane, visita Los Angeles para reconciliar-se com sua esposa durante uma festa de Natal. Quando terroristas armados tomam o prédio, McClane deve usar sua astúcia e treinamento para resgatar os reféns e frustrar os planos dos criminosos.",
            categorias = arrayOf(0,1,0,0,0,0,0,0,0,0),
            categoriasSTR = "Ação, Thriller"
        )
    )

    val filmesAventura = arrayOf(
        Filme(
            url="https://firebasestorage.googleapis.com/v0/b/nautiflix-e49ec.appspot.com/o/Adventure%2FJurassic%20Park%20Official%20Trailer%20%231%20-%20Steven%20Spielberg%20Movie%20(1993)%20HD.mp4?alt=media&token=d4f98a19-cc21-428c-a142-4f8d973522e2",
            titulo = "Jurassic Park",
            capa = R.drawable.jurassicpark_cover,
            poster = R.drawable.jurassicpark_card,
            sinopse = "Um parque temático com dinossauros clonados se transforma em um pesadelo quando as medidas de segurança falham. Um grupo de visitantes deve lutar pela sobrevivência contra as criaturas pré-históricas que escapam de suas cercas.",
            categorias = arrayOf(0,0,1,0,0,0,0,0,0,0),
            categoriasSTR = "Aventura, Sci-Fi"
        ),
        Filme(
            url="https://firebasestorage.googleapis.com/v0/b/nautiflix-e49ec.appspot.com/o/Adventure%2FKing%20Kong%20(1933)%20-%20TRAILER%20-%20Merian%20C.%20Cooper%2C%20Ernest%20B.%20Schoedsack.mp4?alt=media&token=106cf5e3-9678-42e6-9791-6e6426b8a485",
            titulo = "King Kong - 1933",
            capa = R.drawable.kingkong_cover,
            poster = R.drawable.kingkong_card,
            sinopse = "Exploradores descobrem uma ilha misteriosa onde um gigantesco gorila, King Kong, reina supremo. O gorila é capturado e levado a Nova York, onde escapa e causa caos enquanto tenta recuperar a liberdade.",
            categorias = arrayOf(0,0,1,0,0,0,0,0,0,0),
            categoriasSTR = "Aventura, Terror"
        ),
        Filme(
            url = "https://firebasestorage.googleapis.com/v0/b/nautiflix-e49ec.appspot.com/o/Adventure%2FNorth%20by%20Northwest%20-%20Original%20Theatrical%20Trailer.mp4?alt=media&token=37fe63bf-a8fe-4dec-b0cc-42440d7753d9",
            titulo = "North by Northwest",
            capa = R.drawable.northbynorthwest_cover,
            poster = R.drawable.northbynorthwest_card,
            sinopse = "Roger Thornhill, um publicitário, é erroneamente identificado como um agente do governo por uma organização de espionagem. Em uma perseguição emocionante através dos Estados Unidos, ele deve provar sua inocência e descobrir os verdadeiros conspiradores.",
            categorias = arrayOf(0,0,1,0,0,0,0,0,0,0),
            categoriasSTR = "Aventura, Thriller"
        ),
        Filme(
            url = "https://firebasestorage.googleapis.com/v0/b/nautiflix-e49ec.appspot.com/o/Adventure%2FHD%20-%20Raiders%20of%20the%20Lost%20Ark%20(1981)%20Theatrical%20Trailer.mp4?alt=media&token=345549cc-f4fd-4ff1-8dc6-0f3fb8cd13ee",
            titulo = "Raiders of the Lost Ark",
            capa = R.drawable.indianajones_cover,
            poster = R.drawable.indianajones_card,
            sinopse = "O arqueólogo aventureiro Indiana Jones é contratado pelo governo dos EUA para encontrar a Arca da Aliança antes que os nazistas a adquiram. Em uma corrida contra o tempo, Indy deve enfrentar armadilhas mortais, inimigos implacáveis e perigos sobrenaturais.",
            categorias = arrayOf(0,0,1,0,0,0,0,0,0,0),
            categoriasSTR = "Aventura, Ação"
        )
    )

    val filmesNoir = arrayOf(
        Filme(
            url = "https://firebasestorage.googleapis.com/v0/b/nautiflix-e49ec.appspot.com/o/Noir%2FThe%20Maltese%20Falcon%20%EF%BD%9C%204K%20Trailer%20%EF%BD%9C%20Warner%20Bros.%20Entertainment.mp4?alt=media&token=a2506bb1-10cb-46dc-af5d-c5a36fceffa3",
            titulo = "The Maltese Falcon",
            capa = R.drawable.themaltesefalcon_cover,
            poster = R.drawable.themaltesefalcon_card,
            sinopse = "O detetive particular Sam Spade é arrastado para uma trama complexa envolvendo uma estatueta valiosa conhecida como o Falcão Maltês. Em meio a traições e crimes, Spade navega por uma rede de mentiras para resolver o mistério.",
            categorias = arrayOf(0,0,0,1,0,0,0,0,0,0),  // Id da categoria Noir
            categoriasSTR = "Noir, Crime"
        ),
        Filme(
            url = "https://firebasestorage.googleapis.com/v0/b/nautiflix-e49ec.appspot.com/o/Noir%2FThe%20Third%20Man%20%EF%BD%9C%20Official%20Trailer.mp4?alt=media&token=730c5283-2bb4-4f7a-9f6f-0b6d15c9d9e3",
            titulo = "The Third Man",
            capa = R.drawable.thethirdman_cover,
            poster = R.drawable.thethirdman_card,
            sinopse = "Em uma Viena pós-guerra dividida, o escritor Holly Martins chega para encontrar seu amigo Harry Lime, apenas para descobrir que ele está morto. Martins investiga e desenterra uma trama de corrupção que desafia tudo o que ele pensava saber sobre Lime.",
            categorias = arrayOf(0,0,0,1,0,0,0,0,0,0),
            categoriasSTR = "Noir, Thriller"
        ),
        Filme(
            url = "https://firebasestorage.googleapis.com/v0/b/nautiflix-e49ec.appspot.com/o/Noir%2FDouble%20Indemnity%20Official%20Trailer%20%231%20-%20Fred%20MacMurray%2C%20Barbara%20Stanwyck%20Movie%20(1944)%20HD.mp4?alt=media&token=456d3e7b-34eb-45a0-97b5-3361fa1de8f6",
            titulo = "Double Indemnity",
            capa = R.drawable.doubleindemnity_cover,
            poster = R.drawable.doubleindemnity_card,
            sinopse = "Um vendedor de seguros é seduzido por uma mulher casada para planejar o assassinato do marido dela e obter um grande pagamento de seguro. No entanto, o plano é complicado pela desconfiança crescente e pelas consequências imprevistas.",
            categorias = arrayOf(0,0,0,1,0,0,0,0,0,0),
            categoriasSTR = "Noir, Crime"
        ),
        Filme(
            url = "https://firebasestorage.googleapis.com/v0/b/nautiflix-e49ec.appspot.com/o/Noir%2FChinatown%20-%20Trailer.mp4?alt=media&token=8150f179-d980-4036-9283-5a3982e6f334",
            titulo = "Chinatown",
            capa = R.drawable.chinatown_cover,
            poster = R.drawable.chinatown_card,
            sinopse = "O detetive particular Jake Gittes investiga uma aparente infidelidade em Los Angeles dos anos 1930, mas rapidamente se encontra em uma teia de corrupção envolvendo os recursos hídricos da cidade, revelando segredos perturbadores.",
            categorias = arrayOf(0,0,0,1,0,0,0,0,0,0),
            categoriasSTR = "Noir, Thriller"
        )
    )


    val filmesRomance = arrayOf(
        Filme(
            url = "https://firebasestorage.googleapis.com/v0/b/nautiflix-e49ec.appspot.com/o/Romance%2FA%20Place%20in%20the%20Sun%20(1951)%20Trailer%20%231%20%EF%BD%9C%20Movieclips%20Classic%20Trailers.mp4?alt=media&token=6ffbb102-962c-460c-ad08-f282b9881472",
            titulo = "A Place in the Sun",
            capa = R.drawable.aplaceinthesun_cover,
            poster = R.drawable.aplaceinthesun_card,
            sinopse = "Um jovem pobre, George Eastman, consegue um emprego na fábrica de seu tio rico e se envolve em um romance com uma operária, Alice Tripp. Sua ambição o leva a um relacionamento com a socialite Angela Vickers, resultando em um dilema trágico e moral.",
            categorias = arrayOf(0,0,0,0,1,0,0,0,0,0),  // Id da categoria Romance
            categoriasSTR = "Romance, Thriller"
        ),
        Filme(
            url = "https://firebasestorage.googleapis.com/v0/b/nautiflix-e49ec.appspot.com/o/Romance%2FETERNAL%20SUNSHINE%20OF%20THE%20SPOTLESS%20MIND%20(2004)%20-%20Official%20Trailer%20-%20directed%20by%20MICHEL%20GONDRY.mp4?alt=media&token=3974f0e0-b50c-4285-92cc-2fa72642318e",
            titulo = "Eternal Sunshine of the Spotless Mind",
            capa = R.drawable.eternalsunshine_cover,
            poster = R.drawable.eternalsunshine_card,
            sinopse = "Joel e Clementine, após um término doloroso, se submetem a um procedimento para apagar as memórias um do outro. À medida que suas lembranças são apagadas, Joel percebe que ainda ama Clementine e tenta reverter o processo enquanto revive os momentos bons e ruins de seu relacionamento.",
            categorias = arrayOf(0,0,0,0,1,0,0,0,0,0),
            categoriasSTR = "Romance, Sci-Fi"
        ),
        Filme(
            url = "https://firebasestorage.googleapis.com/v0/b/nautiflix-e49ec.appspot.com/o/Romance%2FBREAKFAST%20AT%20TIFFANY'S%20%EF%BD%9C%20Official%20Trailer%20%EF%BD%9C%20Paramount%20Movies.mp4?alt=media&token=96e35813-15e8-4423-995a-f5dd33e1156d",
            titulo = "Breakfast at Tiffany's",
            capa = R.drawable.breakfastattiffanys_cover,
            poster = R.drawable.breakfastattiffanys_card,
            sinopse = "A excêntrica Holly Golightly, uma jovem socialite que vive de encontros com homens ricos, desenvolve uma amizade complexa com seu novo vizinho, um escritor em dificuldades. O filme explora temas de identidade e solidão em meio ao glamour de Nova York.",
            categorias = arrayOf(0,0,0,0,1,0,0,0,0,0),
            categoriasSTR = "Romance, Drama"
        ),
        Filme(
            url = "https://firebasestorage.googleapis.com/v0/b/nautiflix-e49ec.appspot.com/o/Romance%2FLetter%20From%20An%20Unknown%20Woman%20(1948)%20Official%20Trailer%20-%20Joan%20Fontaine%2C%20Louis%20Jourdan%20Movie%20HD.mp4?alt=media&token=f70c5a59-734b-4c0f-9092-1b2e8acda526",
            titulo = "Letter from an Unknown Woman",
            capa = R.drawable.letter_cover,
            poster = R.drawable.letter_card,
            sinopse = "Um famoso pianista recebe uma carta de uma mulher que ele não se lembra. A carta revela a história da mulher que o amou secretamente por anos, refletindo sobre o impacto que ele teve em sua vida e os encontros que ele esqueceu.",
            categorias = arrayOf(0,0,0,0,1,0,0,0,0,0),
            categoriasSTR = "Romance, Melodrama"
        )
    )

    val filmesComedia = arrayOf(
        Filme(
            url = "https://firebasestorage.googleapis.com/v0/b/nautiflix-e49ec.appspot.com/o/Comedy%2FAirplane%20(1980)%20Movie%20Trailer.mp4?alt=media&token=bdbe2859-a07c-4a90-887c-722d4f2ea0f5",
            titulo = "Airplane!",
            capa = R.drawable.airplane_cover,
            poster = R.drawable.airplane_card,
            sinopse = "Uma paródia hilária dos filmes de desastre, onde a tripulação de um avião adoece e um piloto em crise deve aterrissar a aeronave com segurança. O filme é cheio de piadas visuais, trocadilhos e humor absurdo.",
            categorias = arrayOf(0,0,0,0,0,1,0,0,0,0),  // Id da categoria Comédia
            categoriasSTR = "Comédia, Drama"
        ),
        Filme(
            url = "https://firebasestorage.googleapis.com/v0/b/nautiflix-e49ec.appspot.com/o/Comedy%2FDuck%20Soup%20(1933)%20Official%20Trailer%20-%20Marx%20Brothers%20Movie%20HD.mp4?alt=media&token=ea87124d-944b-46fa-b696-2ee66c0e12c9",
            titulo = "Duck Soup",
            capa = R.drawable.ducksoup_cover,
            poster = R.drawable.ducksoup_card,
            sinopse = "Os Irmãos Marx estrelam esta sátira política onde Rufus T. Firefly se torna o ditador de Freedonia. O filme é uma crítica cômica aos governos e guerra, repleta de humor anárquico e gags inesquecíveis.",
            categorias = arrayOf(0,0,0,0,0,1,0,0,0,0),
            categoriasSTR = "Comédia, Musical"
        ),
        Filme(
            url = "https://firebasestorage.googleapis.com/v0/b/nautiflix-e49ec.appspot.com/o/Comedy%2FCaddyshack%20(1980)%20Official%20Trailer%20-%20Chevy%20Chase%20Movie.mp4?alt=media&token=eb884c30-5d10-499b-8002-1774ef56e0db",
            titulo = "Caddyshack",
            capa = R.drawable.baddyshack_cover,
            poster = R.drawable.baddyshack_card,
            sinopse = "Em um clube de golfe de alta classe, as desventuras de seus funcionários e frequentadores levam a situações cômicas. Entre os personagens, destacam-se um zelador excêntrico, um jovem caddie e um jogador de golfe rico e arrogante.",
            categorias = arrayOf(0,0,0,0,0,1,0,0,0,0),
            categoriasSTR = "Comédia, Desporto"
        ),
        Filme(
            url = "https://firebasestorage.googleapis.com/v0/b/nautiflix-e49ec.appspot.com/o/Comedy%2FBlazing%20Saddles%20(1974)%20Original%20Trailer%20-%20Gene%20Wilder%20Movie.mp4?alt=media&token=51333c65-8078-497d-9366-599f712832cb",
            titulo = "Blazing Saddles",
            capa = R.drawable.blazingsaddles_cover,
            poster = R.drawable.blazingsaddles_card,
            sinopse = "Uma comédia de Mel Brooks que satiriza os filmes de faroeste. Quando um xerife negro é nomeado para proteger uma cidade racista, ele enfrenta uma série de obstáculos ridículos e se alia a um pistoleiro caído em desgraça para salvar a cidade de vilões corruptos.",
            categorias = arrayOf(0,0,0,0,0,1,0,0,0,0),
            categoriasSTR = "Comédia, Western"
        )
    )

    val filmesMisterio = arrayOf(
        Filme(
            url = "https://firebasestorage.googleapis.com/v0/b/nautiflix-e49ec.appspot.com/o/Mystery%2FBlue%20Velvet%20official%20rerelease%20trailer.mp4?alt=media&token=c953861b-09d7-42e6-86c9-4ee134b6c5bb",
            titulo = "Blue Velvet",
            capa = R.drawable.bluevelvet_cover,
            poster = R.drawable.bluevelvet_card,
            sinopse = "Após encontrar uma orelha humana em um campo, o jovem Jeffrey Beaumont se envolve em um mistério perturbador envolvendo uma cantora de boate e um criminoso sádico. O filme explora os lados sombrios e inquietantes de uma cidade aparentemente pacífica.",
            categorias = arrayOf(0,0,0,0,0,0,1,0,0,0),  // Id da categoria Mistério
            categoriasSTR = "Mistério, Crime"
        ),
        Filme(
            url = "https://firebasestorage.googleapis.com/v0/b/nautiflix-e49ec.appspot.com/o/Mystery%2FRear%20Window%20(1954)%20%EF%BD%9C%20Modern%20Trailer.mp4?alt=media&token=eb2c6a2c-9120-412d-8824-6b6cf8f91716",
            titulo = "Rear Window",
            capa = R.drawable.rearwindow_cover,
            poster = R.drawable.rearwindow_card,
            sinopse = "O fotógrafo L.B. Jeffries, confinado a uma cadeira de rodas, passa o tempo espiando seus vizinhos da janela do apartamento. Ele começa a suspeitar que um dos vizinhos cometeu um assassinato, mas deve provar sua teoria com a ajuda de sua namorada e uma enfermeira.",
            categorias = arrayOf(0,0,0,0,0,0,1,0,0,0),
            categoriasSTR = "Mistério, Thriller"
        ),
        Filme(
            url = "https://firebasestorage.googleapis.com/v0/b/nautiflix-e49ec.appspot.com/o/Mystery%2FSe7en%20(1995)%20Official%20Trailer%20-%20Brad%20Pitt%2C%20Morgan%20Freeman%20Movie%20HD.mp4?alt=media&token=40316402-fec1-4128-9864-d9bcf15f7d61",
            titulo = "Se7en",
            capa = R.drawable.se7en_cover,
            poster = R.drawable.se7en_card,
            sinopse = "Os detetives Somerset e Mills investigam uma série de assassinatos brutais que seguem os sete pecados capitais. À medida que se aproximam do assassino, a linha entre justiça e vingança se torna borrada, levando a uma conclusão chocante.",
            categorias = arrayOf(0,0,0,0,0,0,1,0,0,0),
            categoriasSTR = "Mistério, Thriller, Crime, Terror"
        ),
        Filme(
            url = "https://firebasestorage.googleapis.com/v0/b/nautiflix-e49ec.appspot.com/o/Mystery%2FVertigo%20-%20official%2060th%20anniversary%20trailer.mp4?alt=media&token=bf7a8f10-5c7b-45a3-8ec3-27d3d6cda31b",
            titulo = "Vertigo",
            capa = R.drawable.vertigo_cover,
            poster = R.drawable.vertigo_card,
            sinopse = "O detetive aposentado John 'Scottie' Ferguson é contratado para seguir a esposa de um conhecido, que se comporta de maneira estranha. Sua obsessão por ela o leva a um estado de confusão e desespero, explorando temas de identidade e ilusão.",
            categorias = arrayOf(0,0,0,0,0,0,1,0,0,0),
            categoriasSTR = "Mistério, Thriller"
        )
    )

    val filmesComediasRomanticas = arrayOf(
        Filme(
            url = "https://firebasestorage.googleapis.com/v0/b/nautiflix-e49ec.appspot.com/o/Comedy-Romance%2FThe%20Philadelphia%20Story%20(1940)%20Official%20Trailer%20-%20Cary%20Grant%2C%20Jimmy%20Stewart%20Movie%20HD.mp4?alt=media&token=2577dd19-aa70-4273-912e-ced5504da20a",
            titulo = "The Philadelphia Story",
            capa = R.drawable.thephiladelphiapsory_cover,
            poster = R.drawable.thephiladelphiapsory_card,
            sinopse = "A socialite Tracy Lord está prestes a se casar quando seu ex-marido e um repórter chegam para cobrir o evento. A presença deles complica seus sentimentos, levando a situações cômicas e reflexões sobre amor e relacionamentos.",
            categorias = arrayOf(0,0,0,0,0,0,0,1,0,0),  // Id da categoria Comédias Românticas
            categoriasSTR = "Comédia, Romance"
        ),
        Filme(
            url = "https://firebasestorage.googleapis.com/v0/b/nautiflix-e49ec.appspot.com/o/Comedy-Romance%2FIt%20Happened%20One%20Night%20(1934)%20ORIGINAL%20TRAILER%20%5BHD%201080p%5D.mp4?alt=media&token=3728968c-5fc6-4f5b-ab41-4164a66a1046",
            titulo = "It Happened One Night",
            capa = R.drawable.ithappenedonenight_cover,
            poster = R.drawable.ithappenedonenight_card,
            sinopse = "Um repórter cínico e uma herdeira fugitiva se encontram e se aventuram juntos. Embora inicialmente em desacordo, sua jornada é cheia de momentos hilários que gradualmente revelam um crescente afeto mútuo.",
            categorias = arrayOf(0,0,0,0,0,0,0,1,0,0),
            categoriasSTR = "Comédia, Romance"
        ),
        Filme(
            url = "https://firebasestorage.googleapis.com/v0/b/nautiflix-e49ec.appspot.com/o/Comedy-Romance%2FAnnie%20Hall%20Official%20Trailer%20%231%20-%20Woody%20Allen%20Movie%20(1977)%20HD.mp4?alt=media&token=ea3cf019-5865-4bc1-b473-10fd95f829a5",
            titulo = "Annie Hall",
            capa = R.drawable.anniehall_cover,
            poster = R.drawable.anniehall_card,
            sinopse = "A relação entre o comediante neurótico Alvy Singer e a excêntrica cantora Annie Hall é examinada em uma série de flashbacks. O filme aborda os altos e baixos do amor e as complexidades dos relacionamentos.",
            categorias = arrayOf(0,0,0,0,0,0,0,1,0,0),
            categoriasSTR = "Comédia, Romance"

        ),
        Filme(
            url="https://firebasestorage.googleapis.com/v0/b/nautiflix-e49ec.appspot.com/o/Comedy-Romance%2FWhen%20Harry%20Met%20Sally...%20(1989)%20Original%20Trailer%20%5BHD%5D.mp4?alt=media&token=273f0e38-e150-4d55-aef4-6f825c0a4ea1 ",
            titulo = "When Harry Met Sally",
            capa = R.drawable.whenharrymetsally_cover,
            poster = R.drawable.whenharrymetsally_card,
            sinopse = "Harry e Sally discutem se homens e mulheres podem ser apenas amigos. Ao longo dos anos, sua amizade evolui e se transforma em algo mais, questionando as fronteiras entre amizade e amor romântico.",
            categorias = arrayOf(0,0,0,0,0,0,0,1,0,0),
            categoriasSTR = "Comédia, Romance"
        )
    )

    val filmesFiccaoCientifica = arrayOf(
        Filme(
            url = "https://firebasestorage.googleapis.com/v0/b/nautiflix-e49ec.appspot.com/o/Science%20Fiction%2FBack%20to%20the%20Future%20(1985)%20Theatrical%20Trailer.mp4?alt=media&token=12022f24-30d9-45dd-ae17-432c47ef416a",
            titulo = "Back to the Future",
            capa = R.drawable.backtothefutue_cover,
            poster = R.drawable.backtothefutue_card,
            sinopse = "Marty McFly, um adolescente dos anos 80, acidentalmente viaja de volta a 1955 em uma máquina do tempo inventada pelo excêntrico cientista Doc Brown. Marty deve garantir que seus pais se encontrem e se apaixonem para que ele possa voltar ao futuro.",
            categorias = arrayOf(0,0,0,0,0,0,0,0,1,0),  // Id da categoria Ficção Científica
            categoriasSTR = "Ficção Cientifica, Infantil"
        ),
        Filme(
            url = "https://firebasestorage.googleapis.com/v0/b/nautiflix-e49ec.appspot.com/o/Science%20Fiction%2FSTAR%20WARS%20Original%20Trailer%20(Restored)%20-%201976.mp4?alt=media&token=6099ea82-f741-45b7-a1cd-05c3ad6b8b3f",
            titulo = "Star Wars",
            capa = R.drawable.starwars_cover,
            poster = R.drawable.starwars_card,
            sinopse = "Luke Skywalker, um jovem fazendeiro, descobre sua linhagem Jedi e se junta à luta contra o malvado Império Galáctico. Ele se une a aliados como Han Solo e Leia Organa para destruir a superarma do Império, a Estrela da Morte.",
            categorias = arrayOf(0,0,0,0,0,0,0,0,1,0),
            categoriasSTR = "Ficção Cientifica, Ação"
        ),
        Filme(
            url = "https://firebasestorage.googleapis.com/v0/b/nautiflix-e49ec.appspot.com/o/Science%20Fiction%2F2001%EF%BC%9A%20%20A%20Space%20Odyssey%20-%20Trailer%20%5B1968%5D%20HD.mp4?alt=media&token=3226dc68-209f-4745-a489-10d6270405f5",
            titulo = "2001: A Space Odyssey",
            capa = R.drawable.a2001_cover,
            poster = R.drawable.a2001_card,
            sinopse = "Uma jornada de exploração espacial revela o mistério de um monólito alienígena e a evolução da humanidade. O filme explora temas de inteligência artificial, a origem da humanidade e o destino final do homem.",
            categorias = arrayOf(0,0,0,0,0,0,0,0,1,0),
            categoriasSTR = "Ficção Cientifica, Aventura"
        ),
        Filme(
            url = "https://firebasestorage.googleapis.com/v0/b/nautiflix-e49ec.appspot.com/o/Science%20Fiction%2FInterstellar%20Movie%20-%20Official%20Trailer.mp4?alt=media&token=be0ab708-8896-4d35-bcab-755faa44583e",
            titulo = "Interstellar",
            capa = R.drawable.interstellar_cover,
            poster = R.drawable.interstellar_card,
            sinopse = "Num futuro onde a Terra está morrendo, um grupo de astronautas viaja através de um buraco de minhoca em busca de um novo lar para a humanidade. O filme aborda temas de relatividade do tempo, amor e sacrifício.",
            categorias = arrayOf(0,0,0,0,0,0,0,0,1,0),
            categoriasSTR = "Ficção Cientifica, Aventura"
        )
    )

    val filmesWestern = arrayOf(
        Filme(
            url = "https://firebasestorage.googleapis.com/v0/b/nautiflix-e49ec.appspot.com/o/Western%2FThe%20Wild%20Bunch%20-%20Original%20Theatrical%20Trailer.mp4?alt=media&token=c6ff5124-49c0-404d-bf27-52124bedf284",
            titulo = "The Wild Bunch",
            capa = R.drawable.wildbunch_cover,
            poster = R.drawable.wildbunch,
            sinopse = "Um grupo de fora-da-lei envelhecidos enfrenta a transição para o século 20 e um mundo em mudança enquanto planeja um último assalto. O filme é conhecido por suas cenas violentas e a desconstrução dos mitos do Velho Oeste.",
            categorias = arrayOf(0,0,0,0,0,0,0,0,0,1),  // Id da categoria Western
            categoriasSTR = "Western, Ação"
        ),
        Filme(
            url = "https://firebasestorage.googleapis.com/v0/b/nautiflix-e49ec.appspot.com/o/Western%2FButch%20Cassidy%20and%20the%20Sundance%20Kid%20(1969)%20ORIGINAL%20TRAILER%20%5BHD%201080p%5D.mp4?alt=media&token=43bbc851-fdca-41cb-84e5-941764ef562c",
            titulo = "Butch Cassidy & Sundance Kid",
            capa = R.drawable.butchandkid_cover,
            poster = R.drawable.butchandkid_card,
            sinopse = "Os carismáticos ladrões de bancos Butch Cassidy e Sundance Kid são perseguidos sem descanso por uma equipe de elite. Eles tentam um novo começo na Bolívia, mas continuam a enfrentar desafios que testam sua amizade e habilidade para sobreviver.",
            categorias = arrayOf(0,0,0,0,0,0,0,0,0,1),
            categoriasSTR = "Western, Crime"
        ),
        Filme(
            url = "https://firebasestorage.googleapis.com/v0/b/nautiflix-e49ec.appspot.com/o/Western%2FThe%20Good%2C%20The%20Bad%2C%20and%20the%20Ugly%20(1966)%20%EF%BD%9C%20Official%20Trailer%20%EF%BD%9C%20MGM%20Studios.mp4?alt=media&token=799a22e2-70a0-46ad-b2c7-df759a82fb2f",
            titulo = "The Good, The Bad & The Ugly",
            capa = R.drawable.tgtbtu_cover,
            poster = R.drawable.tgtbtu,
            sinopse = "Três pistoleiros rivais competem para encontrar um tesouro escondido durante a Guerra Civil Americana. O filme é célebre por suas cenas de duelo, trilha sonora icônica e sua abordagem estilística ao gênero western.",
            categorias = arrayOf(0,0,0,0,0,0,0,0,0,1),
            categoriasSTR = "Western, Ação"
        ),
        Filme(
            url = "https://firebasestorage.googleapis.com/v0/b/nautiflix-e49ec.appspot.com/o/Western%2FThe%20Searchers%20(1956)%20Official%20Trailer%20-%20John%20Wayne%2C%20Jeffrey%20Hunter%20Movie%20HD.mp4?alt=media&token=0b98d765-f29d-4eb5-a38f-dce633161a3e",
            titulo = "The Searchers",
            capa = R.drawable.thesearchers_cover,
            poster = R.drawable.thesearchers_card,
            sinopse = "Ethan Edwards, um veterano de guerra, embarca em uma missão para resgatar sua sobrinha sequestrada por nativos americanos. Sua obsessão e preconceitos são desafiados à medida que a busca se estende por anos, levantando questões sobre identidade e justiça.",
            categorias = arrayOf(0,0,0,0,0,0,0,0,0,1),
            categoriasSTR = "Western, Aventura"
        )
    )

}