function HomePage(props){
    return( 
        <>
            <div> Welcome to Next.js !!! </div>           
            <h2> Next count : {props.count}</h2>
        </>
    )
}



export async function getStaticProps(context){
    const res = await fetch('https://api.github.com/repos/vercel/next.js');
    const json = await res.json();
    return{
        props: {
            count: json.size
        }
    }
}

export default HomePage;
