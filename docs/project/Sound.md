# Sound

## Format

Die Audiodateien liegen im Opus-Format vor und wurden mit den folgenden
Einstellungen erstellt:

```
ffmpeg -i <eingabe> -c:a libopus -vbr on -application audio <ausgabe>
```

Um das Opus-Format mithilfe der Java Sound API verwenden zu können, wurde
die [FFSampledSP](https://github.com/hendriks73/ffsampledsp)-Bibliothek (LGPL-2.1)
von Hendrik Schreiber eingebunden.