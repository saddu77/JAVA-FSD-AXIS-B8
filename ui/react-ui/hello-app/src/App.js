import './App.css';
import { Routes,Route,BrowserRouter } from 'react-router-dom';
import Login from './Login';
import SignUp from './SignUp';
import Home from './Home';

function App() {
   return (
    <BrowserRouter>
     <Routes>
       <Route path="" element={ <Login />}></Route>
       <Route path="/login" element={ <Login />}></Route>
       <Route path="/signup" element={ <SignUp />}></Route>
       <Route path="/home" element={ <Home />}></Route>
    </Routes>
    </BrowserRouter>
   
  );
}

export default App;

