import {Link} from 'react-router-dom';

function Login(){
    return(
      <div>
         <h2> Login </h2>
         <Link to="/signup">  SignUp  </Link> <br /> <br />

         <Link to="/home">  Home  </Link>
      </div>
    )
}

export default Login;