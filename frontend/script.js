const getMusicButton = document.querySelector(".submit-button");
const songName = document.querySelector("#song-name");

getMusicButton.addEventListener('click', event => {
    fetch('http://localhost:8080/randomize').then(response => {
        if (!response.ok){
            throw new Error("Server Error!");
        }

        return response.json();
    }).then(data => {
        const artist = data.artist;
        const song = data.name;

        songName.innerHTML = `
            ${artist} - ${song}
        `;
        songName.classList.remove('hide');  
    })
    .catch(error => {
        // Captura erros de requisição ou de tratamento de dados
        console.error('Erro na requisição:', error);
    });
    
})