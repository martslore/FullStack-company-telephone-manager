import logo from './logo.svg';
import './App.css';
import Typography from '@mui/material/Typography';
import Box from '@mui/material/Box';
import ResponsiveAppBar from './components/appbar';
import Telefoni from './components/telefoni';

function App() {
  return (
    <div className="App">
      <Box sx={{ bgcolor: 'text.secondary'}} style = {{minHeight:'100%'}}>
      <ResponsiveAppBar> </ResponsiveAppBar>
      <Telefoni> </Telefoni>
      </Box>
    </div>

  );
}

export default App;

