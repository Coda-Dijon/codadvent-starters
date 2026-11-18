# Starter COBOL

Le starter utilise [GnuCOBOL](https://gnucobol.sourceforge.io/) 3.x (compilateur `cobc`) et `make`.

```sh
make test   # compile et lance le test
make run    # compile et lance le programme principal
make clean  # supprime le dossier build/
```

## Installation

### Linux

```sh
# Debian / Ubuntu
sudo apt install gnucobol make

# Fedora
sudo dnf install gnucobol make
```

### macOS

```sh
brew install gnucobol
```

Si l'installation échoue, ce qui arrive sur certaines versions de macOS où Homebrew doit compiler des dépendances, passez par [Docker](#docker-tous-les-os).

### Windows

Le plus simple est de passer par **WSL** (Ubuntu) :

```powershell
wsl --install -d Ubuntu
```

Ensuite, dans le terminal Ubuntu :

```sh
sudo apt update && sudo apt install gnucobol make
cd /mnt/c/chemin/vers/codadvent-starters/cobol
make test
```

Vous pouvez aussi utiliser [Docker](#docker-tous-les-os).

### Docker (tous les OS)

Pas besoin d'installer GnuCOBOL. Lancez ces commandes depuis le dossier `cobol/`.

macOS / Linux :

```sh
docker run --rm -v "$PWD":/w -w /w debian:trixie-slim \
  sh -c 'apt-get update -qq && apt-get install -y -qq gnucobol make && make test'
```

Windows (PowerShell) :

```powershell
docker run --rm -v "${PWD}:/w" -w /w debian:trixie-slim sh -c "apt-get update -qq && apt-get install -y -qq gnucobol make && make test"
```

> Le message `Warning: program compiled against libxml ...` qui peut s'afficher dans l'image Debian est sans conséquence.
