import { useEffect, useState } from "react";
import * as React from "react";
import Box from "@mui/material/Box";
import TextField from "@mui/material/TextField";
import { Container, Paper, Button } from "@mui/material";

export default function Telefoni() {
  const paperStyle = { padding: "50px 20px", width: 600, margin: "20px auto" };
  const [tipo, setTipo] = useState("");
  const [memoria, setMemoria] = useState("");
  const [marca, setMarca] = useState("");
  const [modello, setModello] = useState("");
  const [dispositivi, setDispositivi] = useState([]);

  const handleClick = (e) => {
    e.preventDefault();
    const dispositivi = {tipo, memoria, marca,modello};
    fetch("http://localhost:8080/dispositivi/add", {
      method: "POST",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify(dispositivi),
    }).then(() => {
      window.location.reload()
    });
  };

  useEffect(() => {
    fetch("http://localhost:8080/dispositivi/getAll")
      .then((res) => res.json())
      .then((result) => {
        setDispositivi(result);
      });
  }, []);

  return (
    <Container>
      <Paper elevation={3} style={paperStyle}>
        <Box
          component="form"
          sx={{
            "& > :not(style)": { m: 1, width: "25ch" },
          }}
          noValidate
          autoComplete="off"
        >
          <h1 style={{align:"center",width:"auto"}}>
          Aggiungi dispositivo
          </h1>
          <TextField
            id="outlined-basic"
            label="Tipo"
            variant="outlined"
            fullWidth
            value={tipo}
            onChange={(e) => setTipo(e.target.value)}
          />
          <TextField
            id="outlined-basic"
            label="Memoria"
            variant="outlined"
            fullWidth
            value={memoria}
            onChange={(e) => setMemoria(e.target.value)}
          />
          <TextField
            id="outlined-basic"
            label="Marca"
            variant="outlined"
            fullWidth
            value={marca}
            onChange={(e) => setMarca(e.target.value)}
          />
          <TextField
            id="outlined-basic"
            label="Modello"
            variant="outlined"
            fullWidth
            value={modello}
            onChange={(e) => setModello(e.target.value)}
          />

        </Box>
        <Button variant="contained" onClick={handleClick}>
          Salva
        </Button>
        </Paper>

      <Paper elevation={3} style={paperStyle}>
      <h1 style={{align:"center"}}>Dispostivi archiviati</h1>
          {dispositivi.map(dispositivi=>( 
               <Paper elevation={6} style={{margin:"10px",padding:"15px",textAlign:"left"}} key={dispositivi.id}>
                   Tipo: {dispositivi.tipo}<br/>
                   Marca: {dispositivi.marca}<br/>
                   Modello: {dispositivi.modello}<br/>
                   Memoria: {dispositivi.memoria}<br/>


        </Paper>
          ))
}
    </Paper>

    </Container>
  );
}
