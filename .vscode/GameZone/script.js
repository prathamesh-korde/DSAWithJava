// Function to show the games section
function showGames() {
    document.getElementById('games').classList.remove('hidden');
    window.location.hash = '#games';
}

// Function to simulate game start
function playGame(gameName) {
    alert('Starting ' + gameName + '...');
}
