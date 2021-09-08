interface InputProps {
    type: string,
    placeholder?:string,
    value?: string
}

export function Input(props: InputProps){
    return (
        <input {...props}/>
    )
}
