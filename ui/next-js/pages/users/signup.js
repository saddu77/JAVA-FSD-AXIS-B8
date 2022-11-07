import Link from "next/link"


export default function SignUp(){
    return (
        <>
        <h2> Sign Up</h2>
        <h2>
            <Link href="/users/login">
                <a> Login </a>
            </Link>
        </h2>
        </>
    )

}